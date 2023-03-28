import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

        final int counter = 1; // Кол-во клиентов
        int buttonMenu;  // Переменная для работы с программой
        Client[] cl = new Client[counter];
        Device[] dev = new Device[counter];
        Delivery[] deliv = new Delivery[counter];
        Price[] cost = new Price[counter];
        InfoClass[] info = new InfoClass[counter];

        System.out.println("\t\t\t\tКомпания << OOO Max Sound >>");
        System.out.print("Введите 1, чтобы начать запись клиента (0 - чтобы закрыть программу) : ");
        buttonMenu = scanner.nextInt();

        switch (buttonMenu) {
            case 1 :
                for (int i = 0; i < counter; i++) {
                    cl[i] = new Client();
                    dev[i] = new Device();
                    deliv[i] = new Delivery();
                    cost[i] = new Price();
                    info[i] = new InfoClass();
                    cl[i].ClientSet();
                    dev[i].InfoDevice();
                    dev[i].InfoDefects();
                    deliv[i].InfoDelivery();
                    cost[i].InfoPrice();
                    System.out.println(cost[i].AllSum());
                    System.out.println("- - - -");
                    info[i].Print();
                    System.out.println("- - - -");
                }
                break;
            case 0 :  System.out.println("Окончание работы программы.");
                break;
            default : System.out.println("Введенное вами значение не соответствует 1 или 0! ");
                break;
        }
    }
}