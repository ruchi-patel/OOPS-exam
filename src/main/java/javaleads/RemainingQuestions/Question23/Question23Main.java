package javaleads.RemainingQuestions.Question23;

public class Question23Main {
    public static void main(String[] args) {
        OverloadingClass object = new OverloadingClass();
        System.out.println(object.addition(2,3));
        System.out.println(object.addition(2,3,5));
        object.printMessage("Hi there");

        OverridingClass object2 = new OverridingClass();
        object2.printMessage("Hi there");

    }
}
