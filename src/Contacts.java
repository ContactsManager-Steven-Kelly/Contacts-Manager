import java.util.ArrayList;

public class Contacts {
    public static void main(String[] args) {

    }
    private String names;
    private String number;

    //-------constructor-------------
    public Contacts(){
        this("Default name", "Default number");
    }
    public Contacts(String name, String number){
        this.names = name;
        this.number = number;
    }

    public String getNames() {
        return names;
    }

    public String getNumber() {
        return number;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
