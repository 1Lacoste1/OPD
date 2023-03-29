import java.io.Serializable;
import java.util.Scanner;
public class Price extends Delivery implements Serializable {
    private int totalAmount;
    public void InfoPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стоимость за ремонт оборудования: ");
        price = scanner.nextInt();
    }
    public int AllSum() {
        totalAmount = price + deliv;
        return totalAmount;
    }

    @Override
    public String toString() {
        return  "Стоимость за ремонт оборудования: " + price + "\n" +
                "Общая стоимость с учетом доставки и стоимости ремонта: " + totalAmount;
    }
}
