package com.kj.witchsaga.services;

public class People {

    private Integer deathYear;

    private Integer deathAge;

    public People() {
    }

    public People(Integer deathYear, Integer deathAge) {
        this.deathYear = deathYear;
        this.deathAge = deathAge;
    }

    public Integer getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(Integer deathYear) {
        this.deathYear = deathYear;
    }

    public Integer getDeathAge() {
        return deathAge;
    }

    public void setDeathAge(Integer deathAge) {
        this.deathAge = deathAge;
    }

    public Integer getBornYear(){
        return this.deathYear - this.deathAge;
    }
}
