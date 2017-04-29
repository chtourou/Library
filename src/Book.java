
public class Book {
    private int id;
    private String name;
    private String date;
    private int nbCopies;
    private Author author;

    public Book(int id, String name, String date, int nbCopies, Author author) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.nbCopies = nbCopies;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNbCopies() {
        return nbCopies;
    }

    public void setNbCopies(int nbCopies) {
        this.nbCopies = nbCopies;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String describeYourSelf() {
        return "Id: " + id + " name: " + name + " date: " + date + " nbCopy: " + nbCopies
                + "\n\tAuthor: " + author.describeYourSelf();
    }
}
