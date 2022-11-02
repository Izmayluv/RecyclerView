package com.example.a11222;

public class State {

    private String name; // название
    private String capital;  // столица
    private int flagResource; // ресурс флага
    private String population;

    public State(String name, String capital, int flag, String population){
        this.name = name;
        this.capital = capital;
        this.flagResource = flag;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getFlagResource() {
        return this.flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
