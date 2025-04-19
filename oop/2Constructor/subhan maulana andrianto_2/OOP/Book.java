public class Book {

    // property
    private String title;
    private int price;

    // constructor = memasukkan nilai awal ke atribute
    public Book(String _title, int _price) {
        title = _title;
        price = _price;
    }

    // method get = mendapatkan output data
    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    // method set = mengubah nilai atribute private
    public void setTitle(String _title) {
        title = _title;
    }

    public void setPrice(int _price) {
        price = _price;
    }

}