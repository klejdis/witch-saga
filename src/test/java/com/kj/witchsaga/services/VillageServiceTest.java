package com.kj.witchsaga.services;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class VillageServiceTest {

    @Test
    public void calculateAverageOfDeath() {

        VillageService villageService = new VillageService();
        Witch witch = new Witch();

        List<People> peopleList = new ArrayList<>();

        People p1 = new People(10,20);
        People p2 = new People(4,3);

        peopleList.add(p1);
        peopleList.add(p2);

        //no witch on the village
        Assert.assertEquals(Double.valueOf(-1),villageService.calculateAverageOfDeath(peopleList));


        //set the witch but not the year it took controll
        villageService.setWitch(witch);
        Assert.assertEquals(Double.valueOf(-1),villageService.calculateAverageOfDeath(peopleList));


        //set the year it took contrll
        witch.setYearItTookControll(10);
        villageService.setWitch(witch);
        Assert.assertEquals(Double.valueOf(-1),villageService.calculateAverageOfDeath(peopleList));


        People p3 = new People(30,15);//deaths at year 15 were 1596
        People p4 = new People(20,6); //deaths at year 14 were 986

        peopleList.clear();

        peopleList.add(p3);
        peopleList.add(p4);

        Assert.assertEquals(Double.valueOf(1291.0),villageService.calculateAverageOfDeath(peopleList));

    }
}