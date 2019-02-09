package part3;

import java.util.ArrayList;
import java.util.Collection;

public class Ship<T> {
    private Collection<T> droids;

    public Ship() {
        droids = new ArrayList<>();
    }

    public Ship(Collection<T> droids) {
        this.droids = droids;
    }

    public Collection<T> getDroids() {
        return droids;
    }

    public void setDroids(Collection<T> droids) {
        this.droids = droids;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "droids=" + droids +
                '}';
    }
}
