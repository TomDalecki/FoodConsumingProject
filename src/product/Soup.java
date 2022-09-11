package product;

import person.ConsumingMan;
import person.ProducingMan;

public class Soup extends Food {
    public Soup(String foodName, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(foodName, producingMan, consumingMan);
        System.out.println("Soup has been produced");
    }
}
