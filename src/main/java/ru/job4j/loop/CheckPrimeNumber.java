package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        if (number != 2) {
            for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                    prime = false;
                break;
                } else if (number % index != 0) {
                    prime = true;
            }
        }
        } else {
            prime = true;
        }
        return prime;
    }
}