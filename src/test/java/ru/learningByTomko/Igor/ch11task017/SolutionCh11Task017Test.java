package ru.learningByTomko.Igor.ch11task017;

import ru.learningByTomko.Igor.Assertion;

public class SolutionCh11Task017Test {

    public static void main(String[] args) {
        multiplyByTwo();
    }

    public static void multiplyByTwo() {
        int[] expected = {2, 4, 22};
        Assertion.assertEquals("SolutionCh11Task017Test.multiplyByTwo", expected, SolutionCh11Task017.multiplyByTwo(new int[]{1, 2, 11}));
    }

}