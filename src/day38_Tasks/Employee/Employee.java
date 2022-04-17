package day38_Tasks.Employee;

public class Employee {



    public String name;
    public int age;
    public char gender;
    public int id;
    public String jobTitle;
    public int salary;
    public String comapnyName;



    public Employee(String name, int age, char gender, int id, String jobTitle, int salary, String comapnyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.comapnyName = comapnyName;
    }



    public void work(){
        System.out.println(name + " works hard");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", comapnyName='" + comapnyName + '\'' +
                '}';
    }


}


/*
1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()


	2. Create  the following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot

		if any adidtional field or methods needed, please add them

 */