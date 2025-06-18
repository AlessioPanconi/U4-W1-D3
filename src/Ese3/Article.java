package Ese3;

import java.util.Random;

public class Article {

    private final int articleCode;
    public String articleDescription;
    public double price;
    public int numbersOfArticle;

    //Costruttore

    public Article (String articleDescription, double price, int numbersOfArticle)
    {
        Random rndm = new Random();
        this.articleCode=rndm.nextInt(1, 10000);
        this.articleDescription=articleDescription;
        this.price=price;
        this.numbersOfArticle=numbersOfArticle;
    }
}
