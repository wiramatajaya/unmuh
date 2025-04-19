public class Laptop {
    // PROPERTIES
    String user;
    String brand;

    // METHODS
    String hidupkanLaptop() {
        return " Hidupkan Laptop  " + brand + " milik " + brand;
    }

    String matikanLaptop(String paramUser, String paramBrand) {
        return " Matikan Laptop " + paramBrand + " milik " + paramUser;
    }

    String restartLaptop(String paramUser, String paramBrand) {
        return " restart laptop " + user + "milik" + paramBrand;
    }

    void Running(String paramUser, String paramBrand) {
        System.out.println(hidupkanLaptop());
        System.out.println(matikanLaptop(user, brand));
        System.out.println(restartLaptop(paramUser, paramBrand));
        System.out.println("================================");
    }
}
