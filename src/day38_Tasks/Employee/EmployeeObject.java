package day38_Tasks.Employee;

public class EmployeeObject {

    public static void main(String[] args) {

        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Piki", 55, 'm', 0001, 45000, "Cydeo");
        ProductOwner productOwner = new ProductOwner("Tiki", 45, 'f', 0002, 500000, "Cydeo");
        Developer developer = new Developer("Fiki", 35, 'f', 0003, 40600, "Cydeo");
        ScrumMaster scrumMaster = new ScrumMaster("Miki", 25, 'f', 0004, 50350, "Cydeo");
        Teacher teacher = new Teacher("Kiki", 65, 'f', 0005, 25000, "Cydeo");
        Driver driver = new Driver("Niki", 60, 'm', 0006, 1000000, "Ferrari");
        Pilot pilot = new Pilot("Neil", 45, 'm', 0066, 80000, "Apollo");
        Tester tester = new Tester("Testere", 32, 'm', 0007, 25000, "Norway");

        System.out.println(tester);
        System.out.println(pilot);
        System.out.println(driver);
        System.out.println(teacher);
        System.out.println(scrumMaster);
        System.out.println(developer);
        System.out.println(productOwner);
        System.out.println(businessAnalyst);
        System.out.println();

        tester.work();
        pilot.work();
        driver.work();
        developer.work();
        teacher.work();
        scrumMaster.work();
        productOwner.work();
        businessAnalyst.work();



    }
}
