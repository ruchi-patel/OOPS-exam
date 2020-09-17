package javaleads.RemainingQuestions.Question7;

public class Question7 {
    public static void main(String[] args) {
        Product product = new ProductImpl();
        System.out.println("Total coffee: " + product.addStock("coffee", 1));
        System.out.println("Total coffee: " + product.addStock("coffee", 10));
    }
}
