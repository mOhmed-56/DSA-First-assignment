public class Main {
    public static void main(String[] args) {
        Phonelist list =new Phonelist();

        list.addcontact("ALice", "123-456-7890");
        list.addcontact("m0", "123-456-7890");
        list.addcontact("Saad", "123-456-7890");
        list.addcontact("Gehad", "123-456-7890");
        list.displaylist();
        list.SearchContact("m0");
        list.deleteContact("ALice");
        list.displaylist();
}






    }
