public class Comic extends Book {

    // property
    private String category;

    // constructor
    public Comic(String _judul, int _harga, String _category) {
        super(_judul, _harga);
        category = _category;
    }

    // method get = mendapatkan output data
    public String getCategory() {
        return category;
    }

    // method set = mengubah nilai atribute private
    public void setCategory(String _category) {
        category = _category;
    }
}