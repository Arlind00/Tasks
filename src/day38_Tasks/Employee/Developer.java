package day38_Tasks.Employee;


public class Developer extends Employee {



    public Developer(String name, int age, char gender, int id, int salary, String comapnyName) {
        super(name, age, gender, id, "'Developer", salary, comapnyName);
    }



    public void work() {
        System.out.println(name + " works as Developer very hard");
    }

    public String toString() {
        return "Developer{" +
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


/*
2. Create ethe following subclasses and override the work method in each subclass:

			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot
 */