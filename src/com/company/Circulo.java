package com.company;

import java.util.Objects;

public class Circulo {

    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +

                " area "+ calculateAreaCircle() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.radio, radio) == 0 && color.equals(circulo.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radio, color);
    }



    public double calculateAreaCircle() {
        return Math.PI*Math.pow(radio, 2);
    }

}
