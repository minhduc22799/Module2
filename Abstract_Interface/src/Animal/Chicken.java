package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Animal.Chicken: chicken chicken";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
