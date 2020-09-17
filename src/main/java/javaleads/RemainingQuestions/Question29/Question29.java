package javaleads.RemainingQuestions.Question29;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) throws AgeDoesNotMatchException {
        System.out.println("Enter name:");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();

        System.out.println("Enter age");
        Scanner sc2 = new Scanner(System.in);
        int age  = sc2.nextInt();

        Student object = new Student(name,age);

    }
}
