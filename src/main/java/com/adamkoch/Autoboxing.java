package com.adamkoch;

import java.io.IOException;

/**
 * @author aakoch
 * @since 6/21/2016
 */
public class Autoboxing {
    public static void main(String[] args) throws IOException {
        one();
        two();
        three();
    }

    private static void one() throws IOException {
        Integer a = 1;
        Integer b = 1;

        System.out.println("Given:\n\tInteger a = 1;\n\tInteger b = 1;\n\tSystem.out.println(\"a == b: \" + (a == b))" +
                ";\nWhat will be printed?");
        waitForKeyPress();
        System.out.println("a == b: " + (a == b) + "\n");
    }

    private static void waitForKeyPress() throws IOException {
        System.out.println("[Press Enter for answer]");
        System.in.read();
    }

    private static void two() throws IOException {
        Integer a = 1234;
        Integer b = 1234;

        System.out.println("Given:\n\tInteger a = 1234;\n\tInteger b = 1234;\n\tSystem.out.println(\"a == b: \" + (a " +
                "== b))" +
                ";\nWhat will be printed?");
        waitForKeyPress();
        System.out.println("a == b: " + (a == b) + "\n");
    }

    private static void three() throws IOException {
        Integer a = 1234;
        Integer b = 1234;


        System.out.println("Given:\n\tInteger a = 1234;\n\tInteger b = 1234;\n\tSystem.out.println(\"a.intValue() == b.intValue(): \" + (a.intValue() == b.intValue()));\nWhat will be printed?");
        waitForKeyPress();
        System.out.println("a.intValue() == b.intValue(): " + (a.intValue() == b.intValue()));
    }

    private static void four() {
        Integer a = 1234;
        Integer b = 1234;

        System.out.println("a.equals(b): " + (a.equals(b)));
    }
}
