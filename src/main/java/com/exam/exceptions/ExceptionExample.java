package com.exam.exceptions;

/**
 * Create 3 custom exceptions classes called NumberTooLargeException and NumberTooSmallException and ZeroNumberException
 * write a class called ExceptionExample with main method.
 * Accept a number from user and print “Allocated Memory” if the number is less than or equal to 10000.
 * Or throw NumberTooSmallException if number is negative and NumberTooLargeException if number is bigger than 10000.
 * and ZeroNumberException if number is zero
 */

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        try {
            validate(input);
            System.out.println("Allocated Memory");
        } catch (NumberTooSmallException | NumberTooLargeException | ZeroNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(int input) throws NumberTooSmallException, NumberTooLargeException, ZeroNumberException {
        if (input > 10000) {
            throw new NumberTooLargeException("The number is too big..");
        } else if (input < 0) {
            throw new NumberTooSmallException("The number is too small..");
        }else if (input == 0){
            throw new ZeroNumberException("The number is zero...");
        }

    }
}
