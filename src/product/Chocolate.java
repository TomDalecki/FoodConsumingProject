package product;

import person.ConsumingMan;
import person.ProducingMan;

public class Chocolate extends Food {
    public Chocolate(String foodName, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(foodName, producingMan, consumingMan);
        System.out.println("Chocolate has been produced");
    }
}
