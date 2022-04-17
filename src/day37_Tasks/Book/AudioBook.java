package day37_Tasks.Book;


public class AudioBook extends Book {



    public double length;
    public String narrator;



    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }




    public void listen() {
        System.out.println("Reader is listening " + title + " from author: " + author);
    }

    public String toString() {
        return "AudioBook{" +
                "title= " + title  +
                ", type= " + type   +
                ", author= " + author   +
                ", length= " + length +
                ", narrator= " + narrator   +
                ", price= $" + price +
                '}';
    }

}




/*
3.3 Create a sub class of Book named AudioBook:
        variables:
        title, type, author, price, length, narrator

        Methods:
        setInfo()
        listen()
        toString()
 */
