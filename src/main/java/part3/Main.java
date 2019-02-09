package part3;

public class Main {
    public static void main(String[] args) {
        Ship<Droid> ship = new Ship<>();
        ship.getDroids().add(new Droid("Artem"));
        System.out.println(ship.getDroids());
    }
}
