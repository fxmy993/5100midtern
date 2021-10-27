package edu.northeastern.fxmy;

public class Reference extends Book{

    private String category;


    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    @Override
    public String description() {
        String description = getTitle()+" all information is real.";
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
