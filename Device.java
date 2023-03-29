import java.io.Serializable;
import java.util.Scanner;
import java.lang.String;
public class Device extends InfoClass implements Serializable {
    void InfoDevice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t\tИнформация об устройстве");
        System.out.print("Введите тип устройства: ");
        tip_device = scanner.next();

        System.out.print("Марка: ");
        brand = scanner.next();

        System.out.print("Модель: ");
        model = scanner.next();

        System.out.print("Год выпуска: ");
        years_issue = scanner.nextInt();
    }
    void InfoDefects() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Информация о наличии внешних деффектов(после первичной проверки): ");
        defects = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Тип устройства: " + tip_device + "\n" +
                "Марка: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "Год выпуска: " + years_issue + "\n" +
                "Информация о наличии внешних деффектов(после первичной проверки): " + defects + "\n";
    }
}
