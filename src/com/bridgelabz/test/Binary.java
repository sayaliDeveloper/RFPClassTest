package com.bridgelabz.test;
import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binary);

        int swappedNumber = ((number & 0x0F) << 4) | ((number & 0xF0) >> 4);
        System.out.println("Swapped number: " + swappedNumber);

        boolean isPowerOfTwo = (number != 0) && (number & (number - 1)) == 0;
        System.out.println("Is the number a power of 2? " + isPowerOfTwo);
    }
}