package com.ct.vlevy.ForArrayBasic;

public class PrimeNumbers {
    public static void main(String[] args) {
        outputPrimeNumbers();
    }

    static void outputPrimeNumbers() {
        System.out.println("Prime numbers is range [0, 2]:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime (int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
