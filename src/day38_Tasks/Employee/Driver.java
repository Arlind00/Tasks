package day38_Tasks.Employee;

public class Driver extends Employee{



    public Driver(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "Driver", salary, comapnyName);
    }



    public void work(){
        System.out.println(name + " works as Driver very hard");
    }

    public String toString() {
        return "Driver{" +
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
