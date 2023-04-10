package org.example;

import org.example.Cars.*;
import org.example.Method.*;
import org.example.Customer.Customer;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Model> arrayModels = new ArrayList<>();
    public static ArrayList<Customer> clients = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /**
         * Создаем ArrayList типам Model и с помощю метода add
         * вызвым нужные конструкторы и сразу иноцилизируем
         */
        arrayModels.add(new Tesla("Tesla", "model-3", 2000000, 2015, "black", "Electric", 3));
        arrayModels.add(new Tesla("Tesla", "model-5", 3000000, 2013, "Gold", "Electric", 2));
        arrayModels.add(new Tesla("Tesla", "model-S", 4000000, 2011, "White", "Electric", 1));
        arrayModels.add(new Ferrari("Ferrari", "f40", 2300000, 2010, "Red", 400, 2));
        arrayModels.add(new Ferrari("Ferrari", "monzaSp1", 5300000, 2014, "Purple", 410, 1));
        arrayModels.add(new Ferrari("Ferrari", "monzaSp2", 7300000, 2017, "White", 415, 3));
        arrayModels.add(new Bugatti("Bugatti", "veyron", 1800000, 2011, "Blue", "USA", 2));
        arrayModels.add(new Bugatti("Bugatti", "divo", 7500000, 2022, "Black", "USA", 4));
        arrayModels.add(new Bugatti("Bugatti", "chivon", 3600000, 2015, "Red", "USA", 5));

        /**
         * Создаем ArrayList типам Customer и с помощю метода add
         * вызвым нужные конструкторы и сразу иноцилизируем
         */
        clients.add(new Customer(1, "John", 45, 20000000));
        clients.add(new Customer(2, "Alice", 34, 22000000));
        clients.add(new Customer(3, "Bob", 65, 53000000));


        /**
         * Создаем обьект для класса Methods
         * чтобы вызвать его методы
         */
        Methods methods = new Methods();
        int auto;
        do {
            System.out.println("1. Authorization \n2. Exit");
            auto = scanner.nextInt();
            switch (auto) {
                case 1:
                    System.out.println("=============Welcome=============");
                    System.out.println("===========Authorisation=========");
                    System.out.print("\n\t-Login : ");
                    String login = scanner.next();
                    System.out.print("\n\t-Password : ");
                    int password = scanner.nextInt();
                    //Если напиешем нужны логин пароль клиента то сработает if
                    if (login.equals("customer") && password == Filtr.passwordCustomer) {
                        System.out.println("=======Welcome \"Customer\" service=======");
                        int enterCustomer;
                        do {
                            System.out.println("""
                                    1. All cars\s
                                    2. Sort Year\s
                                    3. Need color\s
                                    4. Sort Price\s
                                    5. Buy cash\s
                                    6. Apply for a loan\s
                                    7. Exit""");
                            enterCustomer = scanner.nextInt();
                            switch (enterCustomer) {
                                //в case мы вызываем методы класса Methods
                                case 1:
                                    //Показывает все машины
//                                    for (Model item : arrayModels)
//                                        item.printReport();
                                    arrr(arrayModels);
                                    break;
                                case 2:
                                    //Сортирует по годам
                                    methods.sortYear(arrayModels);
                                    break;
                                case 3:
                                    //Пишем нужный цвет
                                    methods.needColor(arrayModels);
                                    break;
                                case 4:
                                    methods.sortPrice(arrayModels);
                                    break;
                                case 5:
                                    methods.customer(arrayModels);
                                    break;
                                case 6:
                                    methods.payForCredit(arrayModels);
                                    break;
                                case 7:
                                    System.out.println("Exit");
                                    break;
                            }
                        } while (enterCustomer != 7);//Если enterCustomer равоен 7ми  то программа выйдет и аккканта Customer
                    }
                    if (login.equals("admin") && password == Filtr.passwordAdmin){
                        int answer;
                        do {
                            System.out.println("1. All cars \n2. Sold car \n3. New cars \n4. Add new cars\n5. Exit");
                            answer = scanner.nextInt();
                            //Вызывает нужно методы для admina
                            switch (answer) {
                                case 1:
                                    for (Model item : arrayModels)
                                        item.printReport();
                                    break;
                                case 2:
                                    methods.soldCar(Filtr.soldCar);
                                    break;
                                case 3:
                                    methods.newCar();
                                    break;
                                case 4:
                                    methods.addNewCars(arrayModels);
                                    break;
                                case 5:
                                    System.out.println("Exit");
                            }
                        }while (answer != 5);
                    }
                    break;
                case 2:
                    System.out.println("See you soon...!!!");
                    break;
            }
        }while (auto != 2);
    }
    static void arrr (ArrayList<Model> model){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter price ");
        int arrr= scanner.nextInt();
        for (Model item : model){
            if (item.getPrice() > arrr)
                item.printReport();
        }
    }
}