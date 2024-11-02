public class Phonelist {
    private ContactNode head;
    private ContactNode tail;


    public Phonelist() {
        head=tail=null;
    }

    public Phonelist(ContactNode head) {
        this.head = head;
    }

    public void addcontact(String name,String phonenumber){
        if (head==null) {
            head=tail=new ContactNode(name,phonenumber);
            
        }
        else{
            tail.next=new ContactNode(name,phonenumber);
            tail=tail.next;
        }
        System.out.println("Contact added: " + name + ", " + phonenumber);
    }
    public void displaylist(){
        if (head==null) {
            System.out.println("There is No Contacts on the list");
        }
        else{
        ContactNode temp=head;
        while (temp !=null) {
            System.out.println("Name :"+temp.name+","+"Phone:"+temp.phone_number);
            temp=temp.next;
            }
        }

    }

    public void SearchContact(String name){
        if (head==null) {
            System.out.println("The list is empty");
         }
         else{
            ContactNode temp=head;
            while (temp.next!=null) {
                if (temp.name==name) {
                    System.out.println("Contact found: Name: " + temp.name + ", " + "Phone: " + temp.phone_number); 
                }
                temp=temp.next;

            }
            System.out.println("Contact with name "+name+" is not found");

         }

}
        public void deleteContact(String name){
         ContactNode temp=head;
         boolean checker=true;
         if (temp.name==name) {
            head=head.next;
            System.out.print("Contact Removed: " + name + ", " + temp.phone_number + "\n");
            checker=false;
         }
         else{
            while (temp.next != null) {
                if (temp.next.name == name) {
                    System.out.print("Contact Removed: " + name + ", " + temp.phone_number + "\n");
                    checker=false;
                    temp.next=temp.next.next;
                break;
                }
                temp=temp.next;

            }
         }
         if (checker) {
            System.out.println("Contact with name " + name + " not found.");

         }
        

            






        }




    }

