package ru.learningByTomko.Igor.ch02task013;

import ru.learningByTomko.Igor.Assertion;

public class SolutionCh02Task013Test {

    //Метод запуска теста
    public static void main(String[] args) {
        reversNumber();
    }
    //Метод Теста
    public static void reversNumber() {
        int expected = 987;
        int actual = SolutionCh02Task013.reversNumber(789);
        Assertion.assertEquals("SolutionCh02Task013Test.reversNumber", expected, actual);
    }
}