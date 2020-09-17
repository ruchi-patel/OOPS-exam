package javaleads.RemainingQuestions.Question25;

public class Apple implements Fruit {
    @Override
    public boolean isSweet() {
        System.out.print("Apple is sweet:");
        return true;
    }

    @Override
    public boolean isPoisonous() {
        System.out.print("Apple is poisonous:");
        return false;
    }
}
