public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.judul = "Si kancil";
        book1.kategori = "Alam";
        book1.harga = 15000;

        System.out.println("judul: " + book1.judul);
        System.out.println("kategori: " + book1.kategori);
        System.out.println("harga: " + book1.harga);

        Book book2 = new Book();
        book2.judul = "Naruto";
        book2.kategori = "Action";
        book2.harga = 20000;

        System.out.println("judul: " + book2.judul);
        System.out.println("kategori: " + book2.kategori);
        System.out.println("harga: " + book2.harga);
    }
}
