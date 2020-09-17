package com.exam.encapsulation;

public class StudentDetails {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent_name("Ruchi");
        student.setStudent_age(27);
        student.setDepartment("IT");
        System.out.println(student.getStudent_name());
        System.out.println(student.getStudent_age());
        System.out.println(student.getDepartment());
    }
}
