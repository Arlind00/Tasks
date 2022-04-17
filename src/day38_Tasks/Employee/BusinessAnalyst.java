package day38_Tasks.Employee;

public class BusinessAnalyst extends Employee{



    public BusinessAnalyst( String name,int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "BusinessAnalyst", salary, comapnyName);
    }



    public void work(){
        System.out.println(name + " works as Business Analyst very hard");
    }

    public String toString() {
        return "Business Analyst{" +
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
