package ru.mirea.prak11;

public class Book implements Priceable{
    private int bookPrice;
    private String bookName;

    public Book(int bookPrice, String bookName) {
        this.bookPrice = bookPrice;
        this.bookName = bookName;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public int getPrice() {
        return this.bookPrice;
    }
}
