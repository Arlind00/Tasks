package day38_Tasks.Employee;

public class ProductOwner extends Employee {



    public ProductOwner(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "Product Owner", salary, comapnyName);
    }



    public void work(){
        System.out.println(name + " works as Product Owner very hard");
    }

    public String toString() {
        return "ProductOwner{" +
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
