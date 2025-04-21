package user;
// package packageApp;

import user.biodata.Biodata;

public class Main {
    public static void main(String[] args) {
        Biodata myBio = new Biodata("wiramatajaya", 23);
        System.out.println(myBio.getName());
    }

}
