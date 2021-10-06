package com.kj.witchsaga.services;

public class Witch {
    private Integer yearItTookControll;

    public Witch() {
    }

    public Witch(Integer yearItTookControll) {
        this.yearItTookControll = yearItTookControll;
    }

    public Integer getYearItTookControll() {
        return yearItTookControll;
    }

    public void setYearItTookControll(Integer yearItTookControll) {
        this.yearItTookControll = yearItTookControll;
    }

    /**
     * The number of killed villagers is calculated from the fibonaci sequence
     *
     * @param year
     * @return
     */
    public Integer getNumberOfKilledOnYear(Integer year){

        //validate the year
        if (year <= 0)
            return 0;

        // Initialize result
        int sum = 0;
        double phi = (1 + Math.sqrt(5)) / 2;

        // Add remaining terms
        for (int i=0; i<=year; i++)
        {
            sum = sum + (int)Math.round(Math.pow(phi, i) / Math.sqrt(5));
        }

        return sum;
    };



}
