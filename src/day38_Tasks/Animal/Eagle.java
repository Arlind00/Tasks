package day38_Tasks.Animal;

public class Eagle extends Animal {


    public Eagle(String breed, int age, char gender, String size, String color) {
        super("EAGLE", breed, age, gender, size, color);
    }


    public void eat() {
        System.out.println(" eagle eats eagle food");
    }

    public String toString() {
        return "Eagle{" +
                "name= " + name + '\'' +
                ", breed= " + breed + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                ", size= " + size + '\'' +
                ", color= " + color + '\'' +
                '}';
    }
}
