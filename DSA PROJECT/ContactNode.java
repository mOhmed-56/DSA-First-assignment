public class ContactNode{
String name;
String phone_number;
ContactNode next;
public ContactNode() {

}

public ContactNode(String name, String phone_number) {
    this.name = name;
    this.phone_number = phone_number;
}

public ContactNode(String name, String phone_number, ContactNode next) {
    this.name = name;
    this.phone_number = phone_number;
    this.next = next;
}






}