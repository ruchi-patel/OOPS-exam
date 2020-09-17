package javaleads.RemainingQuestions.Question7;

import javaleads.RemainingQuestions.Question7.Product;

public class ProductImpl implements Product {

    int totalStock = 0;

    @Override
    public int addStock(String productName, int quantity) {
        totalStock = totalStock + quantity;
        return totalStock;
    }
}
