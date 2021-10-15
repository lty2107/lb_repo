package com.javacourse.se.lessoon1;

/**
 * Java Core1
 * Основы 1. Структура программы, синтаксис, типы данных
 *
 * Лабораторная работа
 */
public class Refactoring {
    public static void main(String[] args) {
        int a;
        double b;
        a = 11;
        b = 5.2;
        System.out.println(m1(a, b));
        System.out.println(m2(a, b));
        System.out.println(m3(a, b));
        System.out.println(m4(a, b));
        System.out.println(m5(a, b));
        System.out.println(m6(a, b));
    }

    private static double m1(int a, double b) {
        return a + b;
    }

    private static double m2(int a, double b) {
        return a - b;
    }

    private static double m3(int a, double b) {
        return a * b;
    }

    private static double m4(int a, double b) {
        return a / b;
    }

    private static double m5(int a, double b) {
        return Math.pow(b,a);
    }

    private static double m6(int a, double b) {
        return a % b;
    }
}

