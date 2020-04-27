package com.kimberlee.exercise07;

/**
 *
 * @author Max
 */
public class SpringForwardFallBack {

    public static void main(String[] args) {

        System.out.println("It's Spring...!");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ", ");
        }

        System.out.println("\n Oh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.println(i + ", ");

        }
    }

}
