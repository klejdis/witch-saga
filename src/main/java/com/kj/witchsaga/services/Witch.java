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

        int fibo[] = new int[year+1];
        fibo[0] = 0; fibo[1] = 1;

        // Initialize result
        int sum = fibo[0] + fibo[1];

        // Add remaining terms
        for (int i=2; i<=year; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }

        return sum;
    };



}
