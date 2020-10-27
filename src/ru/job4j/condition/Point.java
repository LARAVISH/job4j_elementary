package ru.job4j.condition;

public class Point {

    public static double distance (int x1, int y1, int x2, int y2){
        double res = Math.pow((x2 - x1),2);
        double res1 = Math.pow((y2 - y1),2);
        double result = Math.sqrt((res + res1));
        return result;
    }

    public static void main(String[] args) {
        double res = Point.distance(0,0,2,0);
        System.out.println("result (0,0) (2,0) " + res);
    }


}
