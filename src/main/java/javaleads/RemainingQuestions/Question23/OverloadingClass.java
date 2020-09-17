package javaleads.RemainingQuestions.Question23;

public class OverloadingClass {
    public int addition(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }

    // Overloaded method : addition

    public int addition(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        return sum;
    }

    public void printMessage(String message){
        System.out.println(message);
    }


}
