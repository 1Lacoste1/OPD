import java.util.Scanner;
import java.lang.String;

public class Client extends InfoClass{
    void ClientSet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона клиента (89200928730): ");
        number_mobile = scanner.nextLine();
        System.out.print("Введите имя клиента: ");
        name = scanner.nextLine();
    }
}