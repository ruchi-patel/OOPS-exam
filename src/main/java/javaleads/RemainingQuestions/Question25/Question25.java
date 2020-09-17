package javaleads.RemainingQuestions.Question25;

public class Question25 {
    public static void main(String[] args) {
        Apple obj1 = new Apple();
        System.out.println(obj1.isPoisonous());
        System.out.println(obj1.isSweet());

        PoisonousBerry obj2 = new PoisonousBerry();
        System.out.println(obj2.isPoisonous());
        System.out.println(obj2.isSweet());

    }
}
