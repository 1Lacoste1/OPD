import java.util.Scanner;
public class Delivery extends InfoClass {
    void InfoDelivery() {
        Scanner scanner = new Scanner(System.in);
        int helpButton = 0; // a - Переменная работы в меню программы

        System.out.print("\t\t\t\tДоставка:\n");
        System.out.print("Доставка осуществляется только в пределах Москвы.\n");

            System.out.print("Название улицы или пр-та: ");
            street = scanner.next();

            System.out.print("Номер дома: ");
            home = scanner.nextInt();

            System.out.print("Номер квартиры: ");
            flat = scanner.nextInt();

        System.out.print("Стоимость доставки: " + deliv + " рублей.");
    }
}
