import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String text = "Введите цену товара (в руб.):";
        int price = getValue(text);

        text = "Введите вес товара (в кг.):";
        int weight = getValue(text);

       System.out.print("Размер пошлины (в руб.) составит: " + calculateCustoms(price, weight));
    }

    public static int getValue(String text) {
        System.out.print(text + " ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double calculateCustoms(int price, int weight) {
        return (price / 100.0) + (weight * 100);
    }
}