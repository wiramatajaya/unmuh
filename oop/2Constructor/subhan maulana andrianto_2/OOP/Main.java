public class Main {
    public static void main(String[] args) {

        // proses pembuatan object
        Book cerita1 = new Book("Buya Hamka", 14000);
        System.out.println(cerita1.getTitle());
        System.out.println(cerita1.getPrice());

        Comic cerita2 = new Comic("Naruto", 18000, "Fiksi");
        System.out.println(cerita2.getCategory());
        System.out.println(cerita2.getPrice());
        System.out.println(cerita2.getCategory());
    }
}