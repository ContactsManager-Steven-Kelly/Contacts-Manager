import java.util.ArrayList;

public class ContactList {
    public static void main(String[] args) {
    }

    private ArrayList<Contact> contactList;

    public ContactList(Contact info) {
        Contact contact = info;
        contactList.add(contact);
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }
}
