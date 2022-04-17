package day38_Tasks.Animal;


public class Tiger extends Animal {



    public Tiger(String breed, int age, char gender, String size, String color) {
        super("TIGER", breed, age, gender, size, color);
    }



    public void eat() {
        System.out.println(" tiger eats tiger food");
    }

    public String toString() {
        return "Tiger{" +
                "name= " + name + '\'' +
                ", breed= " + breed + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                ", size= " + size + '\'' +
                ", color= " + color + '\'' +
                '}';
    }

}
