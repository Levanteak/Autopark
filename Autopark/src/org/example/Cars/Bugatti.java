package org.example.Cars;

public class Bugatti extends Model{
    private String foundCity;
    public Bugatti(String title, String model, int price, int year, String color, String foundCity, int count) {
        super(title, model, price, year, color, count);
        this.foundCity = foundCity;
    }

    public String getFoundCity() {
        return foundCity;
    }

    public void setFoundCity(String foundCity) {
        this.foundCity = foundCity;
    }
    @Override
    public void printReport(){
        if (getCount() > 0)
            System.out.println("===========" + getTitle() + "===========\n" +
                "Model : " + getModel() + "\nPrice : " + getPrice() +
                "\nYear : " + getYear() + "\nColor : " + getColor() +
                "\nFound Year : " + foundCity + "\nCount : " + getCount() + "\n==============================\n");
    }

    @Override
    public String toString() {
        return "===========" + getTitle() + "===========\n" +
                "Model : " + getModel() + "\nPrice : " + getPrice() +
                "\nYear : " + getYear() + "\nColor : " + getColor() +
                "\nFound Year : " + foundCity + "\nCount : " + getCount() + "\n==============================\n";
    }
}
