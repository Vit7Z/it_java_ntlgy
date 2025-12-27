import java.util.*;

public class Main {
    static void main(String[] args) {
        Map<Adress, Integer> costPerAdress = new HashMap<>();

        costPerAdress.put(new Adress("Россия", "Москва"), 1000);
        costPerAdress.put(new Adress("Россия", "Оренбург"), 1400);
        costPerAdress.put(new Adress("Россия", "Екатеринбург"), 1800);
        costPerAdress.put(new Adress("Узбекистан", "Ташкент"), 3500);
        costPerAdress.put(new Adress("Киргизия", "Бишкек"), 4500);

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        Set<String> countries = new HashSet<>();

        while (true) {
            System.out.print("Заполнение нового заказа.\n" +
                    "Введите страну: ");
            String country = scanner.nextLine();

            if ("end".equals(country)) {
                break;
            }

            System.out.print("Введите город: ");
            String city = scanner.nextLine();

            System.out.print("Введите вес (кг): ");
            int weight = Integer.parseInt(scanner.nextLine());

            Adress adress = new Adress(country, city);
            if (costPerAdress.containsKey(adress)) {
                int currentPrice = weight * costPerAdress.get(adress);
                total += currentPrice;
                countries.add(country);

                System.out.printf("Стоимость доставки составит: %d руб.\n", currentPrice);
                System.out.printf("Общ. стоимость всех доставок: %d руб.\n", total);
                System.out.printf("Кол. обслуженных стран: %d\n", countries.size());
            } else {
                System.out.println("Доставки по этому адресу нет.");
            }
            System.out.println();
        }
    }
}