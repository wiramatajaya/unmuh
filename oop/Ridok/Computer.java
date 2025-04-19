public class Computer {
    String brand;
    String processor;
    int memory;

    String Check() {
        return "Merk :  " + brand + " processor : " + processor + " memory : " + memory;
    }
}

class Laptop extends Computer {

    Laptop(String _brand, String _processor, int _memory) {
        processor = _processor;
        brand = _brand;
        memory = _memory;
    }
}
