package javaleads.RemainingQuestions.Question25;

import javaleads.RemainingQuestions.Question25.Fruit;

public class PoisonousBerry implements Fruit {
    @Override
    public boolean isSweet() {
        System.out.print("Poisonous Berry is Sweet:");
        return false;
    }

    @Override
    public boolean isPoisonous() {
        System.out.print("Poisonous Berry is Poisonous:");
        return true;
    }
}
