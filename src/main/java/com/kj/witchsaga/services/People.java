package com.kj.witchsaga.services;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;

public class People {

    @Min(1)
    private Integer deathYear;

    @Range(min = 1,max = 150)
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
