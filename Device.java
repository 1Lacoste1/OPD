import java.util.Scanner;
import java.lang.String;
public class Device extends InfoClass {
    void InfoDevice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\tИнформация об устройстве");
        System.out.print("Введите тип устройства: ");
        tip_device = scanner.nextLine();

        System.out.print("Марка: ");
        brand = scanner.nextLine();

        System.out.print("Модель: ");
        model = scanner.nextLine();

        System.out.print("Год выпуска: ");
        years_issue = scanner.nextInt();
    }
    void InfoDefects() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Информация о наличии внешних деффектов(после первичной проверки): ");
        defects = scanner.nextLine();
    }
}
