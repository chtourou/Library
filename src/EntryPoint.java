import java.util.ArrayList;
import java.util.Scanner;

public class EntryPoint {


    public static void main(String[] args) {
        Author author = new Author(1,"Ftou7", true,"Tunisia");
        Book book = new Book(1,"Java Programming", "2017",3, author);
        Author author2 = new Author(2,"Zied", false,"Tunisia");
        Book book2 = new Book(10,"Php Programming", "2010",7, author2);
        ArrayList<Book> listBooks = new ArrayList<>();
        listBooks.add(book);
        listBooks.add(book2);
        Library library = new Library(listBooks);


        while (true){
            showOptions(library);
        }
    }

    private static void showOptions(Library library){

        System.out.println("Choisir operation:");
        System.out.println("(1): lister livres");
        System.out.println("(2): Ajouter livre");
        System.out.println("(3): Supprimer livre");
        System.out.println("(4): Modifier livre");



        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                String livres = library.getBookList();
                System.out.println(livres);
                break;
            case 2:
                System.out.println("Donner id livre:");
                int id = scanner.nextInt();
                System.out.println("Donner nom livre:");
                String name = scanner.next();
                System.out.println(name);
                System.out.println("Donner date livre:");
                String date = scanner.next();
                scanner.nextLine();
                System.out.println("Donner nbCopies livre:");
                int nbCopies = scanner.nextInt();

                System.out.println("Donner id Author:");
                int idAuthor = scanner.nextInt();
                System.out.println("Donner nom Author:");
                String nameAuthor = scanner.next();
                System.out.println("Author married:");
                boolean marriedAuthor = scanner.nextBoolean();
                System.out.println("Donner pays Author:");
                String paysAuthor = scanner.next();
                Author insertAuthor  = new Author(idAuthor,nameAuthor,marriedAuthor,paysAuthor);
                Book insertBook = new Book(id,name,date,nbCopies,insertAuthor);

                library.addBook(insertBook);
                break;
            case 3:
                System.out.println("Donner id de livre a supprimer");
                int idLivre = scanner.nextInt();
                library.removeBook(idLivre);
                break;
            case 4:
                System.out.println("Donner id livre:");
                int idModif = scanner.nextInt();

                Book book = library.getBookWithId(idModif);
                if(book == null){
                    System.out.println("Livre introuvable!");
                    return;
                }


                System.out.println("Donner nom livre:");
                String nameModif = scanner.next();
                System.out.println("Donner date livre:");
                String dateModif = scanner.next();
                scanner.nextLine();
                System.out.println("Donner nbCopies livre:");
                int nbCopiesModif = scanner.nextInt();
                System.out.println("Donner id Author:");
                int idAuthorModif = scanner.nextInt();
                System.out.println("Donner nom Author:");
                String nameAuthorModif = scanner.next();
                System.out.println("Author married:");
                boolean marriedAuthorModif = scanner.nextBoolean();
                System.out.println("Donner pays Author:");
                String paysAuthorModif = scanner.next();
                book.setName(nameModif);
                book.setDate(dateModif);
                book.setNbCopies(nbCopiesModif);
                book.getAuthor().setId(idAuthorModif);
                book.getAuthor().setName(nameAuthorModif);
                book.getAuthor().setMarried(marriedAuthorModif);
                book.getAuthor().setPays(paysAuthorModif);

                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }
}