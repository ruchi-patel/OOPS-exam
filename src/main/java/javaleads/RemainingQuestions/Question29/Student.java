package javaleads.RemainingQuestions.Question29;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws AgeDoesNotMatchException {
        this.name = name;
        this.age = age;
        if(age>17 && age<24) {
            System.out.println("valid user");
        }
        else{
            throw new AgeDoesNotMatchException("Inappropriate age");
        }
    }
}
