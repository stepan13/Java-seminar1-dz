package org.example.hw2;

import java.util.Scanner;

/**
 * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("grows: " + isGrowingSecuence(n));

    }

    /**
     *
     * @param n дина последовательности
     * @return является ли последовательность возрастающей
     */
    private static boolean isGrowingSecuence(int n) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        for (int i = 1; i < n; i++) {
            b = sc.nextInt();
            if (b <= a) return false;
            a = b;
        }
        return true;

    }


}
