
public class Comic extends Books {
    private String category;

    public Comic(String _title, int _price, String _category) {
        super(_title, _price);
        category = _category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String _category) {
        category = _category;
    }

}
