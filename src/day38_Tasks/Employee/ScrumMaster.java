package day38_Tasks.Employee;

public class ScrumMaster extends Employee {



    public ScrumMaster(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "ScrumMaster", salary, comapnyName);
    }



    public void work(){
        System.out.println(name + " works as Scrum Master very hard");
    }

    public String toString() {
        return "ScrumMaster{" +
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
