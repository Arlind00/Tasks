package day38_Tasks.Browser;


public class FireFox extends Browser {



    public FireFox(String name) {
        super(name);
    }


    public void openBrowser() {
        System.out.println(" opening firefox browser ");
    }


    public void closeBrowser() {
        System.out.println(" closing firefox browser ");
    }



    public String toString() {
        return "FireFox{" +
                "name='" + name + '\'' +
                '}';
    }
}
