package day38_Tasks.Browser;

public class Safari extends Browser{


    public Safari(String name) {
        super(name);
    }



    public void openBrowser() {
        System.out.println(" opening Safari browser ");
    }


    public void closeBrowser() {
        System.out.println(" closing Safari browser ");
    }


    public String toString() {
        return "Safari{" +
                "name='" + name + '\'' +
                "  TEST  " +
                '}';
    }
}
