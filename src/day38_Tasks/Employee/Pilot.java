package day38_Tasks.Employee;

public class Pilot extends Employee {


    public Pilot(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "Pilot", salary, comapnyName);
    }

    public void work(){
        System.out.println(name + " works as Pilot very hard");
    }

    public String toString() {
        return "Pilot{" +
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



