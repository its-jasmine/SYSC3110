public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo() {
        this.name = "Bob";
        this.address = "123 Happy Avenue";
        this.phoneNumber = "6135678910";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        BuddyInfo buddyInfo = new BuddyInfo("Homer", "456 Grape Rd", "6131234567");
        System.out.println("Hello " + buddyInfo.getName());
    }
}
