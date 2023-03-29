import java.io.Serializable;
import java.util.Scanner;
public class Delivery extends InfoClass implements Serializable {
    void InfoDelivery() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\t\t\t\tДоставка:\n");
        System.out.print("Доставка осуществляется только в пределах Москвы.\n");

        System.out.print("Название улицы или пр-та: ");
        street = scanner.next();

        System.out.print("Номер дома: ");
        home = scanner.nextInt();

        System.out.print("Номер квартиры: ");
        flat = scanner.next();

        System.out.print("Стоимость доставки: " + deliv + " рублей.");
    }

    @Override
    public String toString() {
        return "Адрес: " + street + ", д." + home + ", кв." + flat + "\n" +
                "Стоимость доставки: " + deliv;
    }
}
