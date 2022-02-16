package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // sobre figuras geometricas para practicar la programacion orientada a objetos

        List<Rectangulo> rectangles = buildArrayRectangles();
        System.out.println(rectangles);
        List<Circulo> circles = buildArrayCircles();
        System.out.println(circles);
        List<Rectangulo> top5rectangles = top5Rectangles(rectangles);
        List<Circulo> top5circles = top5Circles(circles);


        System.out.println(top5rectangles);
        System.out.println(top5circles);

    }

    private static List<Circulo> top5Circles(List<Circulo> circles) {

        return circles.stream()
                .sorted(Comparator.comparingDouble(Circulo::calculateAreaCircle).reversed())
                .limit(5)
                .toList();
    }

    private static List<Rectangulo> top5Rectangles(List<Rectangulo> rectangles) {

        return rectangles.stream()
                .sorted(Comparator.comparing(Rectangulo::calculateAreaRectangulo).reversed())
                .limit(5)
                .toList();


    }

    private static List<Circulo> buildArrayCircles() {

        List<Circulo> circle = new ArrayList<>();

        Circulo circle1 = new Circulo(25, "white");
        Circulo circle2 = new Circulo(12, "black");
        Circulo circle3 = new Circulo(54, "blue");
        Circulo circle4 = new Circulo(75, "rose");
        Circulo circle5 = new Circulo(82, "brown");
        Circulo circle6 = new Circulo(11, "green");
        Circulo circle7 = new Circulo(21, "red");
        Circulo circle8 = new Circulo(112, "grey");

        circle.add(circle1);
        circle.add(circle2);
        circle.add(circle3);
        circle.add(circle4);
        circle.add(circle5);
        circle.add(circle6);
        circle.add(circle7);
        circle.add(circle8);



        return circle;


    }

    private static List<Rectangulo> buildArrayRectangles() {

        List<Rectangulo> rectangle = new ArrayList<>();
        Rectangulo rectangle1 = new Rectangulo(25, 12, "white");
        Rectangulo rectangle2 = new Rectangulo(50, 80, "red");
        Rectangulo rectangle3 = new Rectangulo(27, 52, "rose");
        Rectangulo rectangle4 = new Rectangulo(36, 90, "red");
        Rectangulo rectangle5 = new Rectangulo(110, 78, "black");
        Rectangulo rectangle6 = new Rectangulo(83, 74, "brown");
        Rectangulo rectangle7 = new Rectangulo(250, 125, "blue");
        Rectangulo rectangle8 = new Rectangulo(45, 23, "grey");

        rectangle.add(rectangle1);
        rectangle.add(rectangle2);
        rectangle.add(rectangle3);
        rectangle.add(rectangle4);
        rectangle.add(rectangle5);
        rectangle.add(rectangle6);
        rectangle.add(rectangle7);
        rectangle.add(rectangle8);

        return rectangle;

    }
}




