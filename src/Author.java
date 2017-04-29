
public class Author {
    private int id;
    private String name;
    private boolean married;
    private String pays;

    public Author(int id, String name, boolean married, String pays) {
        this.id = id;
        this.name = name;
        this.married = married;
        this.pays = pays;
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

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String show_info() {
        return "id: " + id + " name: " + name + " married: " + married + " pays: " + pays;
    }
}
