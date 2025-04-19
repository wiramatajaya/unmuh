
public class Main {
    public static void main(String[] args) {

        // NEW OBJECT
        Comic book1 = new Comic("Boruto", 35000, "action");

        // GET PROPERTIES
        // dari parent
        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());

        // Dari child
        System.out.println(book1.getCategory());

        // SET PROPERTIES
        book1.setTitle("Naruto");
        book1.setPrice(50000);
        book1.setCategory("advanture");

        //
        System.out.println("\nSETELAH DI UBAH ");
        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());
        System.out.println(book1.getCategory());

        // GET & SET CHILD

    }
}
