package day38_Tasks.Browser;

public class BrowserObject {


    public static void main(String[] args) {


        Safari safari = new Safari("qka");
        System.out.println(safari);
        safari.closeBrowser();
        safari.openBrowser();
        System.out.println();

        Opera opera = new Opera("fedora");
        System.out.println(opera);
        opera.closeBrowser();
        opera.openBrowser();
        System.out.println();

        Chrome chrome = new Chrome("google");
        System.out.println(chrome);
        chrome.closeBrowser();
        chrome.openBrowser();
        System.out.println();

        FireFox fireFox = new FireFox("fedora");
        System.out.println(fireFox);
        fireFox.closeBrowser();
        fireFox.openBrowser();
    }
}
