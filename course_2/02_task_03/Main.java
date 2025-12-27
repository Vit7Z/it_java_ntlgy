import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        boolean running = true;
        ToDoList listDo = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (running) {
            listDo.showMenu();
            int choise = scanner.nextInt();

            switch (choise) {
                case 0:
                    running = false;
                    break;
                case 1:
                    listDo.addTask();
                    break;
                case 2:
                    listDo.showTasks();
                    break;
                case 3:
                    listDo.removeByNumber();
                    break;
                case 4:
                    listDo.removeByName();
                    break;
                default:
                    System.out.println("Неправильный выбор! Повторите ввод.");
            }
        }
    }
}