package edu.northeastern.fxmy;

public class NonFiction extends Book implements iBorrowable{


    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }



    @Override
    public String description() {
        String description = getTitle()+" all events are true and based on real facts.";
        return description;
    }
}
