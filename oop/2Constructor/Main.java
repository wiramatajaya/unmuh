class Laptop {
    String name;
    String brand;
    int price;

    Laptop(String _name, String _brand, int _price) {
        name = _name;
        brand = _brand;
        price = _price;

    }
}

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("wiramatajaya", "Asus", 30000);
        System.out.println(laptop1.name);
        System.out.println(laptop1.brand);
        System.out.println(laptop1.price);
    }
}
