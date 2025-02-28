import java.time.LocalDate;

public class Transaction {

    private String id;
    private Book book;
    private User user;
    private LocalDate borrowedDate;
    private LocalDate returnDate;

    public Transaction(String id, Book book, User user, LocalDate borrowedDate) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.borrowedDate = borrowedDate;
    }

    public Book getBook() {
        return book;
    }

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void returnBook(LocalDate returnDate){
        book.setAvailable(true);
        this.returnDate = returnDate;
        System.out.println("Book retuned Successfully with ID "+book.getId());

    }

}
