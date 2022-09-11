package person;

import product.Chocolate;
import product.Food;
import product.Sandwich;
import product.Soup;

public class Producer extends Person implements ProducingMan{
    private String product;
    public Producer(String name, String surname, String product) {
        super(name, surname);
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food: " + food);
    }

    @Override
    public String getFavoriteFood() {
        return null;
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName){
            case "Chocolate":
                System.out.println("Chocolate production started");
                return new Chocolate(productName, this, consumingMan);
            case "Soup":
                System.out.println("Soup production started");
                return new Soup(productName, this, consumingMan);
            default:
                System.out.println("Sandwich production started");
                return new Sandwich(productName, this, consumingMan);
        }
    }
}
