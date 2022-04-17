package day38_Tasks.Animal;

public class AnimalObject {

    public static void main(String[] args) {


        Cat cat = new Cat("Russian Blue", 4, 'm', "medium", "grey");
        Dog dog = new Dog("Labrador", 3, 'm', "medium", "yellow");
        Eagle eagle = new Eagle("white head", 7, 'f', "big", "brown and white");
        Tiger tiger = new Tiger("Bengal", 9, 'm', "huge", "yellow with black strips");

        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(dog);
        System.out.println(cat);

        tiger.eat();
        dog.eat();
        eagle.eat();
        cat.eat();


    }
}
