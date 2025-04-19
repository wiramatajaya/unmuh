class Komputer {
    String processor;
    String merk;
    String memory;
    String cekSpesifikasi() {
        return "Laptop ini merknya MSI disertai Processor Intel Core i9 dan memiliki penyimpanan 500 GB";
    }
};

class Laptop extends Komputer {
    Laptop(String _merk, String _processor, String _memory){
        processor = _processor;
        merk = _merk;
        memory = _memory;
    }
    };

class Inheritance {
    public static void main(String args[]){
    Komputer komputerAndi = new Komputer();
    Laptop laptopAndi = new Laptop("MSI", "Intel", "500 GB");
    
    System.out.println(komputerAndi.cekSpesifikasi());
    System.out.println(laptopAndi.processor);
    System.out.println(laptopAndi.merk);
    System.out.println(laptopAndi.memory);
    } 

}