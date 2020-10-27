package ru.job4j.condition;

public class SqArea {
    public  static double square(int p , int k){
        int h = p / (2 * (k + 1));
        int l = h * k;
        double s = l * h;
        return s;
    }

    public static void main(String[] args) {
        double s = SqArea.square(6,2);
        double s1 = SqArea.square(4 , 1);
        System.out.println(" p = 6 , k = 2 , s = " + s);
        System.out.println(" p = 4 , k = 1 , s = " + s1);
    }
}
