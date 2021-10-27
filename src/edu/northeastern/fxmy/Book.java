package edu.northeastern.fxmy;

public abstract class Book implements iBorrowable{

    private String title;
    private String publishYear;
    private double price;
    private int borrowDate;
    private int returnDate;

    public Book(String title ,double price , String publishYear){

        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public abstract String description();


    @Override
    public void setBorrowDate(int day){
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day){
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day){
        return day<borrowDate||day>returnDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
