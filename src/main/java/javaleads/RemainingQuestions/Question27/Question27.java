package javaleads.RemainingQuestions.Question27;

import java.util.Scanner;

/**
 * FizzBuzz Program given number n ..
 * print the values from 1 to n
 * if the number is multiple of 3 print fizz
 * if the number is multiple of 5 print buzz
 * if the number is multiple of both 3 and 5 print fizzbuzz
 * otherwise print the number itself
 */
public class Question27 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();

        for(int i = 1; i <= input; i++){
            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }
            else if(i%5==0){
                System.out.println("buzz");
            }
            else if(i%3==0 ){
                System.out.println("fizz");
            }
            else{
                System.out.println(i);
            }

        }

    }

}
