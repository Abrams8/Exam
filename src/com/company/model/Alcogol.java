package com.company.model;

import java.util.Objects;

public class Alcogol {
    private String tile;
    private double volume;
    private double spirtPersentage;
    private String country;
    private double price;

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSpirtPersentage() {
        return spirtPersentage;
    }

    public void setSpirtPersentage(double spirtPersentage) {
        this.spirtPersentage = spirtPersentage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alcogol alcogol = (Alcogol) o;
        return Double.compare(alcogol.volume, volume) == 0 && Double.compare(alcogol.spirtPersentage, spirtPersentage) == 0 && Double.compare(alcogol.price, price) == 0 && Objects.equals(tile, alcogol.tile) && Objects.equals(country, alcogol.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tile, volume, spirtPersentage, country, price);
    }

    public Alcogol(String tile, double volume, double spirtPersentage, String country, double price) {
        this.tile = tile;
        this.volume = volume;
        this.spirtPersentage = spirtPersentage;
        this.country = country;
        this.price = price;
    }
    public Alcogol(){

    }

    @Override
    public String toString() {
        return "Alcogol{" +
                "tile='" + tile + '\'' +
                ", volume=" + volume +
                ", spirtPersentage=" + spirtPersentage +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}
