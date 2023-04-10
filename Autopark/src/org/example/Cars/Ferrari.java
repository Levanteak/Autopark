package org.example.Cars;

public class Ferrari extends Model {
    private int power;
    public Ferrari(String title, String model, int price, int year, String color, int power, int count) {
        super(title, model, price, year, color, count);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    @Override
    public void printReport(){
        if (getCount() > 0)
            System.out.println("===========" + getTitle() + "===========\n" +
                "Model : " + getModel() + "\nPrice : " + getPrice() +
                "\nYear : " + getYear() + "\nColor : " + getColor() +
                "\nPower : " + power + "\nCount : " + getCount() + "\n==============================\n");
    }

    @Override
    public String toString() {
        return "===========" + getTitle() + "===========\n" +
                "Model : " + getModel() + "\nPrice : " + getPrice() +
                "\nYear : " + getYear() + "\nColor : " + getColor() +
                "\nPower : " + power + "\nCount : " + getCount() + "\n==============================\n";
    }
}
