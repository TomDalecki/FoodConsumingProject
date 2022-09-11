package person;

import product.Food;

public class Consumer extends Person{
    private String favoriteFood;
    public Consumer(String name, String surname, String favoriteFood) {
        super(name, surname);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public void consume(Food food) {
        System.out.println("Consumer consuming food: " + food);
    }

}
