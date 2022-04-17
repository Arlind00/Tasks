package day37_Tasks.Book;


public class Ebook extends Book {

    int pages;
    String size;


    public Ebook(String title, String type, String author, double price, int pages, String size) {
        super(title, type, author, price);
        this.pages = pages;
        this.size = size;
    }



    public void readBook(){
        System.out.println("Reader is reading " + title + " from author: " + author);
    }

    public String toString() {
        return "Ebook{" +
                "title= " + title   +
                ", type= " + type   +
                ", author= " + author   +
                ", price= $" + price +
                ", pages= " + pages +
                ", size= " + size +
                '}';
    }
}


/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */