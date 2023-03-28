import java.io.Serializable;

public class InfoClass implements Serializable {
//    private static final long serialVersionUID = 1L;
    static protected String name, number_mobile, street;
    static protected int years_issue, home = 0,flat = 0, deliv = 1000, price;
    static protected String tip_device, brand, model, defects;

    Object Print() {
        Price obj_1 = new Price();
        System.out.println("Номер телефона клиента: " + number_mobile);
        System.out.println("Имя клиента: " + name);
        System.out.println("Тип устройства: " + tip_device);
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + years_issue);
        System.out.println("Информация о наличии внешних деффектов(после первичной проверки): " + defects);
        System.out.println("Адрес: " + street + ", д." + home + ", кв." + flat);
        System.out.println("Общая стоимость с учетом доставки и ремонта: " + obj_1.AllSum() + " рублей.");
        return null;
    }

}
