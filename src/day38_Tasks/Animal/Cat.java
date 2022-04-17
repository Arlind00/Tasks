package day38_Tasks.Animal;


public class Cat extends Animal {



    public Cat(String breed, int age, char gender, String size, String color) {
        super("CAT", breed, age, gender, size, color);
    }



    public void eat() {
        System.out.println("cat eats cat food");
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
