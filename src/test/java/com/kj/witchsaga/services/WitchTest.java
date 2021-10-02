package com.kj.witchsaga.services;

import org.junit.Assert;
import static org.junit.Assert.*;

public class WitchTest {

    @org.junit.Test
    public void getNumberOfKilledOnYear() {

        Witch witch = new Witch();

        Assert.assertEquals(Integer.valueOf(0),witch.getNumberOfKilledOnYear(0));
        Assert.assertEquals(Integer.valueOf(4),witch.getNumberOfKilledOnYear(3));
        Assert.assertEquals(Integer.valueOf(7),witch.getNumberOfKilledOnYear(4));
        Assert.assertEquals(Integer.valueOf(986),witch.getNumberOfKilledOnYear(14));
        Assert.assertEquals(Integer.valueOf(1596),witch.getNumberOfKilledOnYear(15));



    }
}