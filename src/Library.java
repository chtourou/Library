import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Client> clients;


    public Library(ArrayList<Book> books, ArrayList<Client> clients) {
        this.books = books;
        this.clients = clients;
    }

    //======= BOOK ===========

    //retourner Liste des livres

    public String getBookList() {
        String bookList = "";
        // for (Book book : books) {
        //     bookList += book.describeYourSelf() + "\n";
//        }
        for (int i = 0; i < books.size(); i++) {
            bookList += books.get(i).describeYourSelf() + "\n";
        }
        return bookList;
    }

    // Ajouter un livre
    public void addBook(Book insertBook) {

        books.add(insertBook);
        System.out.println(books.size());
    }

    //supprimer lreiv
    public void removeBook(int idLivre) {
        Book bookToRemove = getBookWithId(idLivre);
        if (bookToRemove != null)
            books.remove(bookToRemove);
        else
            System.out.println("Livre avec id = " + idLivre + " est introuvable!");
    }

    // recupere un livre par son id
    public Book getBookWithId(int idModif) {
        Book bookTofind = null;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == idModif) {
                bookTofind = book;
                break;
            }
        }
        return bookTofind;
    }

    //======== CLIENT =======
    // Afficher List Client
    public String getClientList() {
        String resultat = "";
        for (int i = 0; i < clients.size(); i++) {
            resultat += clients.get(i).toString() + "\n";
        }
        return resultat;
    }

    //Ajouter Client
    public void addClient(Client insertClient) {

        clients.add(insertClient);
        System.out.println(clients.size());
    }

    //Supprimer Client
    public void removeClient(int idClient) {
        Client clientToRemove = getClientWithId(idClient);
        if (clientToRemove != null)
            books.remove(clientToRemove);
        else
            System.out.println("Client avec id = " + idClient + " est introuvable!");
    }

    //Modifier Client

    public Client getClientWithId(int idModif) {
        Client clientTofind = null;
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            if (client.getId() == idModif) {
                clientTofind = client;
                break;
            }
        }
        return clientTofind;
    }


}
