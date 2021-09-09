package ru.learningByTomko.Igor.ch11task017;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionCh11Task017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d]= ", i);
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(multiplyByTwo(array)));
    }

    public static int[] multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        return array;
    }
}
