import java.util.Scanner;

class Main {
    public static double taxEarningsMinusSpendings(int earnings, int spendings) {
        double tax = (earnings - spendings) * 0.15;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static double taxEarnings(int earnings) {
        double tax = earnings * 0.06;
        return tax;
    }

    public static int getValue(String text, Scanner string) {
        System.out.print(text + " ");
        String tmp = string.nextLine();
        int value = Integer.parseInt(tmp);
        return value;
    }

    public static void printOnConsole(String txtOne, String txtTwo, double valOne, double valTwo) {
        System.out.println(" ");
        System.out.println("Советуем систему " + txtOne);
        System.out.println("Налог при " + txtOne + " составит: " + valOne + " руб.");
        System.out.println("Налог при " + txtTwo + " составит: " + valTwo + " руб.");
        System.out.println("Экономия: " + (valTwo - valOne) + " руб.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println(" ");
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогооблажения");

            String str = input.nextLine();

            if ("end".equals(str)) {
                break;
            }

            int operation = Integer.parseInt(str);

            switch (operation) {
                case 1:
                    String text = "Введите сумму дохода: ";
                    int money = getValue(text, input);
                    earnings += money;
                    break;

                case 2:
                    text = "Введите сумму расхода: ";
                    int spend = getValue(text, input);
                    spendings += spend;
                    break;

                case 3:
                    double tax15 = taxEarningsMinusSpendings(earnings, spendings);
                    double tax6 = taxEarnings(earnings);

                    String nameTaxSystem6 = "\"УСН доходы (налог 6% от доходов)\"";
                    String nameTaxSystem15 = "\"УСН доходы минус расходы (налог 15% от разницы)\"";

                    if (tax15 > tax6) {
                        printOnConsole(nameTaxSystem6, nameTaxSystem15, tax6, tax15);
                    }

                    if (tax6 > tax15) {
                        printOnConsole(nameTaxSystem15, nameTaxSystem6, tax15, tax6);
                    }

                    if (tax6 == tax15) {
                        System.out.println(" ");
                        System.out.println("Налоги при обоих системах одинаковы.");
                        System.out.println("Налог составит: " + tax6 + " руб.");
                    }

                    break;

                default:
                    System.out.println("Нет такой команды");
            }
        }
        System.out.println("Программа завершена!");
    }
}