package ru.learningByTomko.Igor.ch02task013;

import java.util.Scanner;

public class SolutionCh02Task013 {
    //Метод main где с помощью CLI вызываем метод решения
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reversNumber(scanner.nextInt()));
    }
    //Метод решения задачи
    public static int reversNumber(int number) {
        return (number % 10 * 100) + (number % 100 / 10 * 10) + (number / 100);
    }
}
