package org.example.Cars;

public class Model {
    /**
     * данные о клиента
     */
    private String title;
    private String model;
    private int price;
    private int year;
    private String color;
    private int count;

    public Model(String title, String model, int price, int year, String color, int count) {
        this.title = title;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void printReport(){

    }
    
}
