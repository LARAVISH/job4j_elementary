package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl1 = value / 60; /* формула перевода рублей в доллары. */
        return rsl1;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(240);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("240 рублей это "+ dollar + " доллара.");
    }
}
