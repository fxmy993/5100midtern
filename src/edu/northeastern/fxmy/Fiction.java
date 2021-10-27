package edu.northeastern.fxmy;

public class Fiction extends Book implements iBorrowable{

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description(){
        String description = getTitle()+" all events are imaginary and not based on real facts.";
        return description;
    }


}
