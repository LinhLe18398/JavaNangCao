package interface_animal;

public class main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        System.out.println(tiger.makeSound());
        System.out.println(chicken.howToEat());


        Orange orange = new Orange();
        Apple apple = new Apple();
        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());
    }
}
