package Ese3;

import java.util.Arrays;

public class Cart {
    private Customer customer;
    private Article[] articles= {
            new Article("Iphone 16 Pro Max", 1500, 100),
            new Article("Phon", 120, 500),
            new Article("Ipad Air M2", 700, 50),
    };

    @Override
    public String toString() {
        return "Cart{" +
                "customer=" + customer +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }
}
