package ir.maktab;

import ir.maktab.Book;

public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 37.99;

    }

    @Override
    public String toString() {
        return "ir.maktab.NonFiction{" +
                "title : " + super.getTitle() +
                ", price=" + price +
                '}';
    }
}
