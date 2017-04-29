/**
 * Created by U-Poste on 29/04/2017.
 */
public class Client {
    private int id;
    private String name;
    private long cin;
    private String adress;

    public Client(int id, String name, long cin, String adress) {

        this.id = id;
        this.name = name;
        this.cin = cin;
        this.adress = adress;

    }

    public Client(int id, String name, String cin, String adress) {
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

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
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
