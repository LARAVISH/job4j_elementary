package ru.job4j.condition;

public class Point {

    public static double distance (int x1, int y1, int x2, int y2){


        return Math.sqrt(Math.pow(((x2 - x1) + (y2 - y1)),2));
    }

    public static void main(String[] args) {
        double res = Point.distance(4,0,8,0);
        System.out.println("result (0,0) (2,0) " + res);
    }


}
