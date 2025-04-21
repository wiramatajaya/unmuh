
public class Books {
    private String title;
    private int price;

    Books(String _title, int _price) {
        title = _title;
        price = _price;
    }

    // mengambil data dari luar
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    // mengedit data dari price
    public void setTitle(String _title) {
        title = _title;
    }

    public void setPrice(int _price) {
        price = _price;
    }

}
