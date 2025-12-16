import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        String text = "Введите цену товара (в руб.):";
        int price = getValue(text, string);

        text = "Введите вес товара (в кг.):";
        int weight = getValue(text, string);

       System.out.print("Размер пошлины (в руб.) составит: " + calculateCustoms(price, weight));
    }

    public static int getValue(String text, Scanner string) {
        System.out.print(text + " ");
        return string.nextInt();
    }

    public static double calculateCustoms(int price, int weight) {
        return (price / 100.0) + (weight * 100);
    }
}