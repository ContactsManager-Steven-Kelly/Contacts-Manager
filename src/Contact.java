public class Contact {
    public static void main(String[] args) {

    }
    private String names;
    private String number;
    private String contact;


    //-------constructor-------------
    public Contact(){
        this("Default name", "Default number");
    }
    public Contact(String name, String number){
        this.names = name;
        this.number = number;
        this.contact = name + " " + number;
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

    public String getContact() {
        return contact;
    }
}
