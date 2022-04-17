package day38_Tasks.Animal;


public class Dog extends Animal {



    public Dog(String breed, int age, char gender, String size, String color) {
        super("DOG", breed, age, gender, size, color);
    }



    public void eat() {
        System.out.println("dog eats dog food");
    }

    public String toString() {
        return "Dog{" +
                "name= " + name + '\'' +
                ", breed= " + breed + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                ", size= " + size + '\'' +
                ", color= " + color + '\'' +
                '}';
    }
}
