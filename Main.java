import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class Main {
    static final String PATH = "/Users/mac/IdeaProjects/OPD2/src/FileResult";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);

  /* Основные объекты для работы и сериализации */
 Client client = new Client();
 Device device = new Device();
 Delivery delivery = new Delivery();
 Price price = new Price();

    /*         Объекты для проверки с деси */
//        Client cl1;
//        Device dev1;
//        Delivery deliv1;
//        Price cost1;

        System.out.println("\t\t\t\tКомпания << OOO Max Sound >>");
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATH));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(PATH));

//        cl1 = (Client) objectInputStream.readObject();
//        dev1 = (Device) objectInputStream.readObject();
//        deliv1 = (Delivery) objectInputStream.readObject();
//        cost1 = (Price) objectInputStream.readObject();
//
//        System.out.println(cl1);
//        System.out.println(dev1);
//        System.out.println(deliv1);
//        System.out.println(cost1);

//        client.setClient();
//        objectOutputStream.writeObject(client);
//
        device.InfoDevice();
        device.InfoDefects();
        objectOutputStream.writeObject(device);

        delivery.InfoDelivery();
        objectOutputStream.writeObject(delivery);

        price.InfoPrice();
        price.AllSum();
        objectOutputStream.writeObject(price);



        objectOutputStream.close();
//        objectInputStream.close();

    }
}
