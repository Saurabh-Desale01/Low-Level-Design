import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("B101", "Chetan Bhagat", "Making India Awesome");
        Book book2 = new Book("B102", "S. Radhakrishnan", "Bhagavad Gita ");

        Map<String, Book> bookLibrary = new HashMap<>();
        bookLibrary.put(book1.getId(), book1);
        bookLibrary.put(book2.getId(), book2);

        User user1 = new User("U101", "Rob");
        User user2 = new User("U102", "Sam");

        Transaction transaction =new Transaction("T101", book1, user1, null);
        user1.borrowBook(book1, LocalDate.now());

        System.out.println("Books in Library "+bookLibrary);
        //System.out.println("Borrowed book "+transaction);

        transaction.returnBook(LocalDate.now());
        System.out.println("Return Book "+ transaction);
        System.out.println("Books in Library "+bookLibrary);
    }
}