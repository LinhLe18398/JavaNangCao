package interface_animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: o o o";
    }

    @Override
    public String howToEat(){
        return "could be fried";
    }
}



