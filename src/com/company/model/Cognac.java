package com.company.model;

import java.util.Objects;

public class Cognac extends Alcogol {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cognac cognac = (Cognac) o;
        return year == cognac.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year);
    }

    @Override
    public String toString() {
        return "Cognac{" +
                "year=" + year +
                "} " + super.toString();
    }

    public Cognac(String tile, double volume, double spirtPersentage, String country, double price, int year) {
        super(tile, volume, spirtPersentage, country, price);
        this.year = year;
    }
    public Cognac(){

    }
}
