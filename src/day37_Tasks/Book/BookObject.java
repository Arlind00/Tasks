package day37_Tasks.Book;

public class BookObject {

    public static void main(String[] args) {


        Ebook ebook = new Ebook("Kindle", "Fantasy", "Arthur Miller", 23.45, 70, "medium");
        AudioBook audioBook = new AudioBook("Sound of Silence", "Educative", "Garfunkel", 45.28, 20, "Attenborough");


        System.out.println(audioBook);
        System.out.println(ebook);
        System.out.println();

        audioBook.listen();
        ebook.readBook();

    }

}
