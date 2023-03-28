import java.util.Scanner;
public class Price extends Delivery {
    void InfoPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость за ремонт оборудования: ");
        price = scanner.nextInt();
    }
    int AllSum() {
        return price + deliv;
    }
}
