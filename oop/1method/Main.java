class Biodata {
    String name;
    int age;
    String gender;

    public String getName() {
        return name;
    }

    public void getAge(int _age) {
        age = _age;
    }

    void getGender(Boolean _gender) {
        if (_gender = true) {
            gender = "Men";
        } else {
            gender = "Women";
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Biodata bio1 = new Biodata();
        bio1.name = "wiramatajaya";
        bio1.getGender(true);

    }

}
