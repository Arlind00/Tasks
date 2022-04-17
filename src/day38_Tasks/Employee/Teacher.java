package day38_Tasks.Employee;

public class Teacher extends Employee{



    public Teacher(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "Teacher", salary, comapnyName);
    }



    public void work(){
        System.out.println(name + " works as Teacher very hard");
    }

    public String toString() {
        return "Teacher{" +
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
