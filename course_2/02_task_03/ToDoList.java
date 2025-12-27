import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private static Scanner console = new Scanner(System.in);
    private static List<String> tasks;

    public ToDoList() {
        this.tasks = new ArrayList<>();
    }

    public void showMenu() {
        System.out.print("Выберите операцию:\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "Ваш выбор: ");
    }

    //1. Добавить дело
    public static void addTask() {
        System.out.println();
        System.out.print("Введите название задачи: ");
        String task = console.nextLine();
        tasks.add(task);
        System.out.println();
    }

    //2. Показать дела
    public static void showTasks() {
        System.out.println();
        if (tasks.size() != 0) {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, tasks.get(i));
            }
        } else {
            System.out.println("Ваш список дел пуст!");
        }
        System.out.println();
    }

    //3. Удалить дело по номеру
    public static void removeByNumber() {
        System.out.println();
        if (tasks.size() != 0) {
            System.out.print("Введите номер задачи: ");
            int pos = Integer.parseInt(console.nextLine()) - 1;
            if (pos >= 0 && pos < tasks.size()) {
                tasks.remove(pos);
            } else {
                System.out.println("Такой задачи нет!");
            }
        } else {
            System.out.println("Ваш список дел пуст! Удалить дела нельзя.");
        }
        System.out.println();
    }

    //4. Удалить дело по названию
    public static void removeByName() {
        System.out.println();
        if (tasks.size() != 0) {
            System.out.print("Введите название задачи: ");
            String str = console.nextLine();
            if (tasks.contains(str)) {
                tasks.remove(str);
            } else {
                System.out.println("Такой задачи нет.");
            }
            System.out.println();
        } else {
            System.out.println("Ваш список дел пуст! Удалить дела нельзя.");
        }
    }
}