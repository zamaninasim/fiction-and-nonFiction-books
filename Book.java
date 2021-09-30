package ir.maktab;

public abstract class Book {
    private String title;
    protected double price;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

    @Override
    public String toString() {
        return "ir.maktab.Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}