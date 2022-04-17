package day38_Tasks.Employee;

public class Tester extends Employee {



    public Tester(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "Tester", salary, comapnyName);
    }

    public void work(){
        System.out.println(name + " works as Tester very hard");
    }

    public String toString() {
        return "Tester{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                ", id= " + id +
                ", jobTitle= " + jobTitle + '\'' +
                ", salary= " + salary +
                ", comapnyName= " + comapnyName + '\'' +
                '}';
    }
}
