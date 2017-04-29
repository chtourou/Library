
public class Client {
    private int id;
    private String name;
    private String cin;
    private String adress;


    public Client(int id, String name, String cin, String adress) {
        this.id = id;
        this.name = name;
        this.cin = cin;
        this.adress = adress;
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

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cin=" + cin +
                ", adress='" + adress + '\'' +
                '}';
    }
}
