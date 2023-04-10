package org.example.Method;
import org.example.Cars.*;
import org.example.Main;
import org.example.Method.*;
import org.example.Customer.Customer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Methods implements Filtr {
    private String name;
    private int money;
    public static ArrayList<Model> arrayNewModels = new ArrayList<>(); //Создан чтобы добавить новые машины

    @Override
    public void sortYear(ArrayList<Model> model) {
        //Сортирует пузыкровый сортировка
        for (int i = 0; i < model.size(); i++) {
            for (int j = 0; j < model.size() - 1; j++) {
                if (model.get(j).getYear() > model.get(j + 1).getYear()) {
                    int temp = model.get(j).getYear();
                    model.get(j).setYear(model.get(j + 1).getYear());
                    model.get(j + 1).setYear(temp);
                }
            }
        }
        for (Model item: model)
            if (item.getCount() > 0)
                item.printReport();
    }

    @Override
    public void sortPrice(ArrayList<Model> model) {
        //Сортирует с помощю пузырковый сортировки
        for (int i = 0; i < model.size(); i++) {
            for (int j = 0; j < model.size() - 1; j++) {
                if (model.get(j).getPrice() > model.get(j + 1).getPrice()) {
                    int temp = model.get(j).getPrice();
                    model.get(j).setPrice(model.get(j + 1).getPrice());
                    model.get(j + 1).setPrice(temp);
                }
            }
        }
        for (Model item: model)
            if (item.getCount() > 0)
                item.printReport();
    }

    @Override
    public void newCar() {
        System.out.println("\t\t\"A NEW DELIVERY HAS ARRIVED\"");
        //Добавим с помощю метода add() и вызываем конструктора и инициализируем
        arrayNewModels.add(new Bugatti("Bugatti", "noire", 1500000, 2018, "Red", "USA", 2));
        arrayNewModels.add(new Tesla("Tesla", "model-X", 7000000, 2021, "Brown", "Electric", 1));
        arrayNewModels.add(new Ferrari("Ferrari", "f50", 8000000, 2016, "Gold", 430, 2));
        System.out.println(arrayNewModels);
    }

    @Override
    public void addNewCars(ArrayList<Model> models) {
        //В  наш основной машину добавый те новый машины который инициалирозовали
        models.addAll(arrayNewModels);
        for (Model item : models)
            item.printReport();
    }
    @Override
    public void needColor(ArrayList<Model> models) {
        //найдет нужный цвет который мы написали
        Scanner scanner = new Scanner(System.in);
        String color;
        System.out.println("Enter your need color");
        color = scanner.next();
        for (Model item : models)
            if (item.getColor().equalsIgnoreCase(color))
                item.printReport();
    }

    @Override
    public void customer(ArrayList<Model> model) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want car ? (Yes/No)");
        String want = scanner.next();
        if (want.equalsIgnoreCase("Yes")){
            System.out.println("Which car are you interested : ");
            System.out.println("1. Tesla \n2. Ferrari \n3. Bugatti \n4. Back");
            int answer = scanner.nextInt();
            switch (answer){
                case 1://если выбираем 1 то клиент хочет купить марку Tesla
                    for (Model item : model)
                        if (item.getTitle().equals("Tesla"))
                            System.out.println("Model : " + item.getModel());
                    System.out.println("Which model are you interesting : ");
                    String enterModel = scanner.next();
                    for (Model item : model)
                        if (item.getModel().equalsIgnoreCase(enterModel)) {
                            //Сохраняем нужный модел и его стоимость чтобы купить
                            name = item.getModel();
                            money = item.getPrice();
                            item.printReport();
                            System.out.println("+++++++++This cost : " + item.getPrice() + "++++++++++++++++");
                        }
                    System.out.println("Do you want this car ? (Yes/No)");
                    String na = scanner.next();
                    if (na.equalsIgnoreCase("Yes"))
                        payCar(Main.clients, Main.arrayModels);//вызываем метод payCar чтобы купитть машину налом
                    break;
                case 2://если выбираем 1 то клиент хочет купить марку Ferrari
                    for (Model item : model)
                        if (item.getTitle().equals("Ferrari"))
                            System.out.println("Model : " + item.getModel());
                    System.out.println("Which model are you interesting : ");
                    String enterModel1 = scanner.next();
                    for (Model item : model)
                        if (item.getModel().equalsIgnoreCase(enterModel1)) {
                            //Сохраняем нужный модел и его стоимость  чтобы купить

                            name = item.getModel();
                            money = item.getPrice();
                            item.printReport();
                            System.out.println("+++++++++This cost : " + item.getPrice() + "++++++++++++++++");
                        }
                    System.out.println("Do you want this car ? (Yes/No)");
                    String na1 = scanner.next();
                    if (na1.equalsIgnoreCase("Yes"))
                        payCar(Main.clients, Main.arrayModels);//вызываем метод payCar чтобы купитть машину налом
                    break;
                case 3:
                    for (Model item : model)
                        if (item.getTitle().equals("Bugatti"))
                            System.out.println("Model : " + item.getModel());
                    System.out.println("Which model are you interesting : ");
                    String enterModel2 = scanner.next();
                    for (Model item : model)
                        if (item.getModel().equalsIgnoreCase(enterModel2)) {
                            name = item.getModel();
                            money = item.getPrice();
                            item.printReport();
                            System.out.println("+++++++++This cost : " + item.getPrice() + "++++++++++++++++");
                        }
                    System.out.println("Do you want this car ? (Yes/No)");
                    String na2 = scanner.next();
                    if (na2.equalsIgnoreCase("Yes"))
                        payCar(Main.clients, Main.arrayModels);
                    break;
                case 4:
                    System.out.println("Back");
                    break;
            }
        }
    }
    @Override
    public void soldCar(ArrayList<String> soldCar) {
        //вызывает все машины который проодоны
        for (String item : soldCar)
            System.out.println(soldCar);
    }

    @Override
    public void payCar(ArrayList<Customer> customers, ArrayList<Model> models) {
        //Метод который логика как купить машину
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account ID you want to search: ");
        int id = scanner.nextInt();
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                System.out.println("Enter your password : ");
                int enter = scanner.nextInt();
                if (enter == Filtr.passwordCustomer) {
                    for (int i = 0; i < models.size(); i++) {
                        if (models.get(i).getModel().equalsIgnoreCase(name)) {
                            System.out.println("=======Your balance before purchase " + customer.getBalance());
                            if (customer.getBalance() >= money) {
                                customer.setBalance(customer.getBalance() - money);
                                System.out.println("=======Your balance after purchase " + customer.getBalance() + "=====");
                                for (Model item : models)
                                    if (item.getModel().equalsIgnoreCase(name)) {
                                        models.get(i).setCount(models.get(i).getCount() - 1);
                                        if (models.get(i).getCount() > 0)
                                            item.printReport();
                                    }
                                System.out.println("=====\"Thank you!!!\"=====");
                                soldCar.add(models.get(i).toString());
                            } else {
                                System.out.println("Your balance is less than " + money + "Failed!!!");
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public void credit(ArrayList<Model> models, ArrayList<Customer> customers){
        //Логика как купить машину в кредит
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you wanna buy this car on credit?(Yes/No)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("Yes")) {
            System.out.print("Enter account ID you want to search: ");
            int id = scanner.nextInt();
            for (Customer customer : customers) {
                if (customer.getId() == id) {
                    System.out.println("Enter your password : ");
                    int enter = scanner.nextInt();
                    if (enter == Filtr.passwordCustomer) {
                        for (int i = 0; i < models.size(); i++) {
                            if (models.get(i).getModel().equalsIgnoreCase(name)) {
                                double PERCENTS = 2.2;
                                double credit = (double) models.get(i).getPrice();
                                System.out.println("Enter first installment : ");
                                double firstPayment = scanner.nextDouble();
                                int bal = customer.getBalance();
                                bal -= firstPayment;
                                System.out.println("How many months do you want to register us ? (12, 24, 36)");
                                double paymentTerm = scanner.nextInt();
                                double leftToPay = credit - firstPayment;
                                double Z = PERCENTS / 100 / paymentTerm;
                                double linearProcent = leftToPay * Z;
                                System.out.format("Linear percentage %.2f\n", linearProcent);
                                double payPerMonth = linearProcent + (leftToPay / paymentTerm);
                                for (double j = leftToPay; j > 0; j -= payPerMonth) {
                                    payPerMonth = linearProcent + (leftToPay / paymentTerm);
                                    System.out.format("Percentage : %-6.2f:\tMoth %-8.2f:\tA hundredth of an amount %-8.2f\n", linearProcent, payPerMonth, j);
                                    System.out.println("Percentage : %-6.2f:\tMoth %-8.2f:\tA hundredth of an amount %-8.2f\n");
                                    System.out.println(linearProcent - (leftToPay - payPerMonth) * Z);

                                }
                                System.out.println(customer.getName() + "'s balance after first payment : " + bal);
                                for (Model item : models) {
                                    if (item.getModel().equalsIgnoreCase(name)) {
                                        item.printReport();
                                        item.setCount(item.getCount() - 1);
                                        soldCar.add(models.get(i).toString());
                                    }
                                }
                                System.out.println("=====\"Thank you!!!\"=====");

                            }
                        }
                    }
                }
            }
        }
    }
    @Override
    public void payForCredit(ArrayList<Model> model) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int enter;
        String answer;
        do {
            System.out.print("""
                    Which car are you interested ?\s
                    1)Tesla
                    2)Ferrari
                    3)Bugatti
                    4)Back""");
            enter = scanner.nextInt();
            switch (enter) {
                case 1:
                    for (Model value : model)
                        if (value.getTitle().equals("Tesla"))
                            System.out.println("Model : " + value.getModel());
                    String enterModel;
                    System.out.println("____________\nWhich model are you interested in ?");
                    enterModel = scanner.next();
                    for (Model item : model)
                        if (item.getModel().equalsIgnoreCase(enterModel)) {
                            name = item.getModel();
                            money = item.getPrice();
                            item.printReport();
                        }
                    System.out.println("Do you want to buy this model ? (Yes/No)");
                    answer = scanner.next();
                    if (answer.equalsIgnoreCase("Yes"))
                        credit(Main.arrayModels, Main.clients);
                    else
                        System.out.println("Back!!!");
                    break;
                case 2:
                    for (Model mod : model)
                        if (mod.getTitle().equals("Ferrari"))
                            System.out.println("Model : " + mod.getModel());
                    String enterModel1;
                    System.out.println("____________\nWhich model are you interested in ?");
                    enterModel1 = scanner.next();
                    for (Model item : model)
                        if (item.getModel().equalsIgnoreCase(enterModel1)) {
                            name = item.getModel();
                            money = item.getPrice();
                            item.printReport();
                        }
                    System.out.println("Do you want to buy this model ? (Yes/No)");
                    answer = scanner.next();
                    if (answer.equalsIgnoreCase("yes"))
                        credit(Main.arrayModels, Main.clients);
                    else
                        System.out.println("Back!!!");
                    break;
                case 3:
                    for (Model mod : model)
                        if (mod.getTitle().equals("Bugatti"))
                            System.out.println("Model : " + mod.getModel());
                    String enterModel2;
                    System.out.println("____________\nWhich model are you interested in ?");
                    enterModel2 = scanner.next();
                    for (Model item : model)
                        if (item.getModel().equalsIgnoreCase(enterModel2)) {
                            name = item.getModel();
                            money = item.getPrice();
                            item.printReport();
                        }
                    System.out.println("Do you want to buy this model ? (Yes/No)");
                    answer = scanner.next();
                    if (answer.equalsIgnoreCase("yes"))
                        credit(Main.arrayModels, Main.clients);
                    else
                        System.out.println("Back!!!");
                    break;
                case 4:
                    System.out.println("Back");
                    break;
            }
        }while (enter != 4);
    }
}