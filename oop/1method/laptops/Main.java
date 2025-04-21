public class Main {
    public static void main(String[] args) {

        // OBJECT 1
        Laptop laptop = new Laptop();
        laptop.user = "Wira ";
        laptop.brand = "ACER";
        laptop.Running(laptop.user, laptop.brand);

        // OBJECT 2
        Laptop laptop2 = new Laptop();
        laptop2.user = "Mata ";
        laptop2.brand = "Asus";
        laptop2.Running(laptop2.user, laptop2.brand);

        // OBJECT 3
        Laptop laptop3 = new Laptop();
        laptop3.user = "Jaya ";
        laptop3.brand = "Lenovo";
        laptop3.Running(laptop3.user, laptop3.brand);

    }
}
