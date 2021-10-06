package com.kj.witchsaga.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillageService {

    private Witch witch;

    public VillageService() {
    }

    public Double calculateAverageOfDeath(List<People> peopleList){
        Integer deathSum = 0;

        if (!hasWitchArrived()){
            return  Double.valueOf(-1);
        }

        //if case an empty list is given
        if (peopleList.size() <= 0){
            return  Double.valueOf(-1);
        }

        //loop through people to get the number of people died at year they were born
        for(int i=0;i<peopleList.size();i++)
        {
            if (isBornBeforeWitchTookControll(peopleList.get(i).getBornYear())){
                return  Double.valueOf(-1);
            }

            deathSum += witch.getNumberOfKilledOnYear(peopleList.get(i).getBornYear());
        }

        return Double.valueOf(deathSum / peopleList.size());
    }

    /**
     * Check if the witch has arrived on the village
     * @return
     */
    protected Boolean hasWitchArrived(){
        if (this.witch != null && this.witch.getYearItTookControll() != null){
            return true;
        }

        return false;
    }

    public Witch getWitch() {
        return witch;
    }

    public void setWitch(Witch witch) {
        this.witch = witch;
    }

    protected boolean isBornBeforeWitchTookControll(Integer year){
        if (this.witch.getYearItTookControll() != null && year < this.witch.getYearItTookControll()){
            return true;
        }

        return false;
    }
}
