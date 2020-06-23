public class Book implements Product {

    private double price;
    private String name;
    private String color;
    private int pages;
    private String author;
    private String isbn;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public String getColor() {
        return null;
    }
}
