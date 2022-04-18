package Lec_15;
import java.util.Scanner;
public class TestApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Book[] books = new Book[] {
//                new Book(1, "Intro to Java"),
//                new Book(2, "Intro to Web"),
//                new Book(3, "Intro to Software Construction")
//        };

        Book books[] = new Book[3];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter the book title for book " +  (i + 1));
            String title = scanner.nextLine();

            books[i] = new Book(i+1, title);
        }

//        for (int i = 0; i < books.length; i++) {
//            System.out.println(books[i].getTitle());
//        }

        for(Book book: books){
            System.out.println(book.getTitle());
        }
    }
}
