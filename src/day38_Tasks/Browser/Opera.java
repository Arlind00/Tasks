package day38_Tasks.Browser;


public class Opera extends Browser {



    public Opera(String name) {
        super(name);
    }




    public void openBrowser() {
        System.out.println(" opening Opera browser ");
    }


    public void closeBrowser() {
        System.out.println(" closing Opera browser ");
    }



    public String toString() {
        return "Opera{" +
                "name='" + name + '\'' +
                '}';
    }
}
