import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        contacts.add(buddy);
    }
    public void removeBuddy(BuddyInfo buddy){
        contacts.remove(buddy);
    }
    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy = new BuddyInfo();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        //hello
        //hello again but on github
    }
}
