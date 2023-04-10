package org.example.Cars;

public class Tesla extends Model {
    private String fuel;
    public Tesla(String title, String model, int price, int year, String color, String fuel, int count) {
        super(title, model, price, year, color, count);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void printReport(){
        if (getCount() > 0)
            System.out.println("===========" + getTitle() + "===========\n" +
                "Model : " + getModel() + "\nPrice : " + getPrice() +
                "\nYear : " + getYear() + "\nColor : " + getColor() +
                "\nFuel : " + fuel + "\nCount : " + getCount() + "\n==============================\n");
    }
    @Override
    public String toString() {
        return "===========" + getTitle() + "===========\n" +
                "Model : " + getModel() + "\nPrice : " + getPrice() +
                "\nYear : " + getYear() + "\nColor : " + getColor() +
                "\nFuel : " + fuel + "\nCount : " + getCount() + "\n==============================\n";
    }
}
