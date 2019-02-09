package part3;

public class Droid {
    private String name;

    public Droid(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name='" + name + '\'' +
                '}';
    }
}
