package com.company.model;

import com.company.model.enums.VineColor;
import com.company.model.enums.VineType;

import java.util.Objects;

public class Vine extends Alcogol {
    private int year;
    private VineColor color;
    private VineType type;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public VineColor getColor() {
        return color;
    }

    public void setColor(VineColor color) {
        this.color = color;
    }

    public VineType getType() {
        return type;
    }

    public void setType(VineType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vine vine = (Vine) o;
        return year == vine.year && color == vine.color && type == vine.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), year, color, type);
    }

    @Override
    public String toString() {
        return "Vine{" +
                "year=" + year +
                ", color=" + color +
                ", type=" + type +
                "} " + super.toString();
    }

    public Vine(String tile, double volume, double spirtPersentage, String country, double price, int year, VineColor color, VineType type) {
        super(tile, volume, spirtPersentage, country, price);
        this.year = year;
        this.color = color;
        this.type = type;
    }
}
