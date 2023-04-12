package animal;

public class KiemThu {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);

        Animal animal = new Animal();
        System.out.println(animal);

        Animal animal1 = new Animal(5, 6);
        System.out.println(animal1);


    }
}
