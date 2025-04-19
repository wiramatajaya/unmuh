package tugas2;

class Computer {

    String checkComputer() {
        return "Ini Berasal class dari Computer (Parent)";
    }
}

class Laptop extends Computer {
    String storage = "256GB";

    String checkLaptop() {
        return "Ini Berasal dari  class Laptop(Child)";
    }
}

class Notebook extends Laptop {
    String checkNotebook(String brand, String processor, int memory) {
        return "Merk : " + brand + " Processor : " + processor + " Memory : " + memory + storage;
    }
}

class Inheritence {
    public static void main(String args[]) {
        Notebook newCheck = new Notebook();
        System.out.println(newCheck.checkNotebook("Asus", "Intel", 8));
        System.out.println(newCheck.checkLaptop());
        System.out.println(newCheck.checkComputer());
    }
}