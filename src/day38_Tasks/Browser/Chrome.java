package day38_Tasks.Browser;

public class Chrome extends Browser {


    public Chrome(String name) {
        super(name);
    }



    public void openBrowser() {
        System.out.println(" opening chrome browser ");
    }


    public void closeBrowser() {
        System.out.println(" closing chrome browser ");
    }



    public String toString() {
        return "Chrome{" +
                "name='" + name + '\'' +
                '}';
    }
}


/*
 1. ChromeBrowser
        methods:
        openBrowser(): prints "opening chrome browser"
        closeBrowser():  prints "closing chrome browser"

 */