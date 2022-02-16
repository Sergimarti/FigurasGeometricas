package com.company;

import java.security.PublicKey;
import java.util.Objects;

public class Rectangulo {

    private double height;
    private double width;
    private String color;

    public Rectangulo(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", area='" + calculateAreaRectangulo() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(that.height, height) == 0 && Double.compare(that.width, width) == 0 && color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, color);
    }



    public double calculateAreaRectangulo() {
        return height*width;
    }
}
