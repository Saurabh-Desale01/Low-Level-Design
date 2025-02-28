import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String id;
    private String name;
    private List<Transaction> borrowedBooks;
    //private Book book;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book, LocalDate issueDate){
        if(book.isAvailable()){
            Transaction transaction = new Transaction("T101", book, this, issueDate);
            borrowedBooks.add(transaction);
            book.setAvailable(false);
        }
    }

}
