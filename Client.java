import java.io.Serializable;
import java.util.Scanner;
import java.lang.String;

public class Client extends InfoClass implements Serializable {
    public void setClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер телефона клиента (89200928730): ");
        number_mobile = scanner.next();
        System.out.print("Введите имя клиента: ");
        name = scanner.next();
    }

    @Override
    public String toString() {
        return "Номер телефона клиента: " +  number_mobile + "\n" +
                "Имя клиента: " + name + "\n";
    }
}