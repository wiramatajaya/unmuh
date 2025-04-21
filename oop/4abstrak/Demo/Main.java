package Demo;

class Product {
    String name;
    int price;

    Product(String _name, int _price) {
        name = _name;
        price = _price;
    }
}

public class Spesifikasi extends Product {
    int ram;
    String processor;

    int getRam() {
        return ram;
    }
}

public class Belajar {
    public static void main(String[] args) {

    }
}
