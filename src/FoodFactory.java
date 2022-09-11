import person.*;
import product.Chocolate;
import product.Food;

import java.util.Arrays;

/* Zadanie Projektu:
    bedziemy mieli jedzenie, do tego producentów i konsumentów,
    konsument i producent też będzie w stanie to jedzenie konsumować
    producent będzie to jedzenie produkował
 */
public class FoodFactory {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        foodFactory.run();
    }
    private void run() {
        ProducingMan[] producingPeople = new ProducingMan[]{
                new Producer("Anna", "Zupa", "Soup"),
                new Producer("Janusz", "Baton", "Chocolate"),
                new Producer("Roman", "Kanapka", "Sandwich")
        };
        ConsumingMan[] consumingPeople = new ConsumingMan[]{
              new Consumer("Jan", "Zajadacz", "Chocolate"),
              new Consumer("Piotr", "Pozeracz", "Soup"),
              new Consumer("Marysia", "Glodomor", "Pizza"),
              new Consumer("Krysia", "Wyjadacz", "Risotto")
        };
//        int counter = 0;
//        for (ConsumingMan consumingPerson : consumingPeople) {
//            for (ProducingMan producingPerson : producingPeople) {
//                if (consumingPerson.getFavoriteFood().equals(producingPerson.getProduct()))
//                {counter++;}
//
//            }
//        }
        int counter = consumingPeople.length;
        Food[] foods = new Food[counter];

//tutaj można by również zastosować fori
        for (int i = 0; i < consumingPeople.length; i++) {
            for (int j = 0; j < producingPeople.length; j++) {
                System.out.println(consumingPeople[i].getFavoriteFood());
                System.out.println(producingPeople[j].getProduct());

                if (consumingPeople[i].getFavoriteFood().equals(producingPeople[j].getProduct())){
                    System.out.println(consumingPeople[i].getFavoriteFood() + " jest nabywca jest producent");
                    Food food = producingPeople[j].produce(producingPeople[j].getProduct(),consumingPeople[i]);
                    foods[i] = food;
                } else {
                    System.out.println(consumingPeople[i].getFavoriteFood() + " nie jest produkowane");
                    Food food = producingPeople[2].produce(producingPeople[2].getProduct(),consumingPeople[i]);
                    foods[i] = food;
                }
            }
        }


        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }

        for (Food food : foods) {
            System.out.println(food);

        }

        System.out.println(Arrays.toString(foods));

    }
}
