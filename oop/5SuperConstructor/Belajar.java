public class Product {
    public String name;
    public int price;

    String getName() {
        return name;
    }

    Product(String _name, int _price) {
        name = _name;
        price = _price;
    }
}

public class Spesifikasi extends Product {
    public int ram;
    public String processor;

    Spesifikasi(String _name, int _price, int _ram, String _processor) {
        super(_name, _price);
        ram = _ram;
        processor = _processor;
    }

    int getRam() {
        return ram;
    }

}

public class Belajar {
    public static void main(String[] args) {
        Spesifikasi spek = new Spesifikasi("oppo", 3000, 128, "snapdragon");
        spek.ram = 256;
        System.out.println(spek.getRam());
    }
}
