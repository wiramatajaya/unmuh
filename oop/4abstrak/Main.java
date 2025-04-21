class Abstract {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    Abstract(String _name) {
        name = _name;
    }
}

public class Main {
    public static void main(String[] args) {

        // MEMBUAT NAMA
        Abstract bio = new Abstract("wiramatajaya");
        System.out.println(bio.getName());

        // MENGUBAH NAMA
        bio.setName("muhammad Maulana");
        System.out.println(bio.getName());

    }
}
