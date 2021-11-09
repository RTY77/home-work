package com.sbrf.reboot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат сложения = " + Calculator.getAddition(4,6));
        System.out.println("Результат вычитания = " + Calculator.getSubtraction(13,3));
        System.out.println("Результат умножения = " + Calculator.getMultiplication(5,2));
        System.out.println("Результат деления = " + Calculator.getDivision(10,2));
        System.out.println("Результат возведения в степень = " + Calculator.getPow(5,3));
        System.out.println("Результат поиска минимального числа = " + Calculator.getMin(56.5,35.3));
        System.out.println("Результат поиска максимального числа = " + Calculator.getMax(242.4,46.8));
    }
}
