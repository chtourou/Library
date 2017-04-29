import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getBookList() {
        String bookList = "";
        for (Book book : books) {
            bookList += book.describeYourSelf() + "\n";
        }
        return bookList;
    }

    public void addBook(Book insertBook) {
        books.add(insertBook);
        System.out.println(books.size());
    }

    public void removeBook(int idLivre) {
        Book bookToRemove = getBookWithId(idLivre);
        if(bookToRemove != null)
            books.remove(bookToRemove);
        else
            System.out.println("Livre avec id = " + idLivre + " est introuvable!");
    }

    public Book getBookWithId(int idModif) {
        Book bookTofind = null;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getId() == idModif){
                bookTofind = book;
                break;
            }
        }
        return bookTofind;
    }
}
