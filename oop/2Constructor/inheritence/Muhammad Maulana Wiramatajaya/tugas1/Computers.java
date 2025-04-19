package tugas1;

class Computer {
    String processor = "Intel Core i9";
    String brand = "Asus";
    String memory = "16 GB";

    String checkComputer() {
        return "Ini berasal dari class Komputer";
    }
}

class Laptop extends Computer {
    String storage = "SSD 1TB";

    String checkLaptop() {
        return "Ini berasal dari class Laptop";
    }
}

class Notebook extends Laptop {
    String detailSpec() {
        return "merk: " + brand + ", processor: " + processor +
                ", jumlah memory: " + memory +
                ", storage: " + storage;
    }

    String checkNotebook() {
        return "Ini berasal dari class Netbook";
    }
}

public class Computers {
    public static void main(String args[]) {

        Notebook netbookAndi = new Notebook();
        System.out.println(netbookAndi.detailSpec());
        System.out.println(netbookAndi.checkComputer());
        System.out.println(netbookAndi.checkLaptop());
        System.out.println(netbookAndi.checkNotebook());
    }
}