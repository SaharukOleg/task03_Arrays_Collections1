package part2;

public class Main {
    public static void main(String[] args) {
        MyDeque<String> deque = new MyDeque<>();

        deque.addLast("Oleg");
        deque.addLast("Vova");
        deque.addLast("Igor");
        deque.addLast("Nazar");

        System.out.println(deque.toString());
    }

}

