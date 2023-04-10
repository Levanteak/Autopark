package org.example.Method;
import org.example.Cars.*;
import org.example.Customer.*;

import java.io.IOException;
import java.util.ArrayList;

public interface Filtr {
    int passwordCustomer = 123;
    /**
     * Пароль слиента const
     */
    int passwordAdmin = 1234;

    /**
     *
     * @param models пароль админа
     */

    public void sortYear(ArrayList<Model> models);

    /**
     * Сортирует машину по годам
     */

    public void newCar();

    /**
     *
     * @param models Этот метод показывает новые машины
     */

    public void addNewCars(ArrayList<Model> models);

    /**
     *
     * @param models Метод который добовляеть новые машины к основным машинам
     */

    public void needColor(ArrayList<Model> models);

    /**
     *
     * @param model Пишешь нужный цвет и показывает все машины котрый соотвествует с уветом
     */

    public void customer(ArrayList<Model> model);

    /**
     *
     * @param soldCar Этот клиент хочет купит машину налом
     */

    public void soldCar(ArrayList<String> soldCar);

    /**
     *
     * @param customers
     * @param models Добовляет на ArrayList soldCar все машины который продоный
     */

    public void payCar(ArrayList<Customer> customers, ArrayList<Model> models);
    /**
     Метод который клиент которую машину хочеть купить
     */

    public void sortPrice(ArrayList<Model> model);

    /**
     *
     * @param models Сортирует все машины по цене
     * @param customers
     */


    public void credit(ArrayList<Model> models, ArrayList<Customer> customers) throws IOException;
    /**
     *
     * @param model Этот метод логикак который как взять в кредитт магшину
     */
    public void payForCredit(ArrayList<Model> model) throws IOException;

    /**
     * Клиент собираеться купить машину в кредит
     */
    ArrayList<String> soldCar = new ArrayList<>();

}
