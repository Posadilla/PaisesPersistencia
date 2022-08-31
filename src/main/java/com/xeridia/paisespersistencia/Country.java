package com.xeridia.paisespersistencia;

import javax.persistence.*;

@Entity
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private long surfaceArea;
    private int indepYear;
    private long population;
    private double lifeExpectancy;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public long getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(long rurfaceArea) {
        surfaceArea = rurfaceArea;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
}