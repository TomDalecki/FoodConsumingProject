package product;

import person.ConsumingMan;
import person.ProducingMan;

public class Sandwich extends Food {
    public Sandwich(String foodName, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(foodName, producingMan, consumingMan);
        System.out.println("Sandwich has been produced");
    }

}

