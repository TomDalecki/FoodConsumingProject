package product;

import person.ConsumingMan;
import person.ProducingMan;

import java.util.Objects;

public abstract class Food {
private final String foodName;
private final ProducingMan producingMan;
private final ConsumingMan consumingMan;

        public Food(String foodName, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.foodName = foodName;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", consumingMan=" + consumingMan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(foodName, food.foodName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodName);
    }
}

