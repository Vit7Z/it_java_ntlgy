import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Лиловый шар", 1982, "Кир Булычев", 464);
        System.out.println("Название книги: " + book1.title);
        System.out.println("Автор: " + book1.author);
        System.out.println("Год выпуска: " + book1.releaseYear);
        System.out.println("Кол. страниц: " + book1.pages);
        System.out.println("Стоимость: " + book1.estimatePrice() + " руб.");
        System.out.println("Книга большая? " + book1.isBig());
        System.out.println("Содержит ли описание книги слово \"мир\"? " + book1.matches("мир"));
        System.out.println("Содержит ли описание книги слово \"шар\"? " + book1.matches("шар"));
    }
}
