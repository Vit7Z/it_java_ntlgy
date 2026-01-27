Перед вами готовый дженерик-класс RandomBox. В неё можно положить любой объект и ключ к нему. Вынуть положенный объект можно только если правильно указать ключ, иначе в ответе будет null.
Вашей задачей будет реализовать дженерик-класс DoubleBox, который позволяет положить в себя два объекта со своими ключами. Реализовывать нужно через хранение объектов в RandomBox-ах (уже даны в полях).
Никакие другие классы кроме DoubleBox менять нельзя. В main дана демонстрация его работы
















public class Main {

    public static void main(String[] args) {
        DoubleBox<String> box = new DoubleBox<>();
        System.out.println("111 -> " + box.get(111)); // null
        System.out.println("SIZE: " + box.size()); // 0
        System.out.println();

        System.out.println("PUT: " + box.put(111, "First string")); // true
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // null
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 1
        System.out.println();

        System.out.println("PUT: " + box.put(22, "Second string")); // true
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // Second string
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 2
        System.out.println();

        System.out.println("PUT: " + box.put(3333, "First string")); // false
        System.out.println("111 -> " + box.get(111)); // First string
        System.out.println("111 -> " + box.get(22)); // Second string
        System.out.println("111 -> " + box.get(3333)); // null
        System.out.println("SIZE: " + box.size()); // 2
    }
}


class RandomBox<T> {
    private int key;
    private T value;

    public RandomBox(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public T tryUnlock(int key) {
        if (this.key == key) {
            return value;
        } else {
            return null;
        }
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}


class DoubleBox<T> {
    private RandomBox<T> first;
    private RandomBox<T> second;

    public boolean put(int key, T value) {
        if (first == null) {
            first = new RandomBox<>(key, value);
            return true;
        }
        if (second == null) {
            second = new RandomBox<>(key, value);
            return true;
        }
        return false;
    }

    public T get(int key) {
        if (first != null) {
            T value = first.tryUnlock(key);
            if (value != null) {
                return value;
            }
        }
        if (second != null) {
            T value = second.tryUnlock(key);
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    public int size() {
        if (first != null) {
            if (second != null) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}