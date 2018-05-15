import java.util.ArrayList;
import java.util.HashMap;

public class Contacts {
    public static void main(String[] args) {

    }
    private String names;
    private String number;
    private ArrayList<String> contactsList = new ArrayList<>();
    private ArrayList<String> contactsNumbers = new ArrayList<>();

    //-------constructor-------------
    public Contacts(){
        this("Default name", "Default number");
    }
    public Contacts(String name, String number){
        this.names = name;
        this.number = number;
        contactsList.add(name);
        contactsNumbers.add(number);
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
