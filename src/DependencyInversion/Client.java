package DependencyInversion;

import java.util.*;

public class Client {
    class data {
        char c;
        Integer f;
        data(char c, int f) {
            this.c = c;
            this.f = f;
        }
    }
    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow(new FastFlyator());
        sparrow.color = "Brown";
        sparrow.weight = 60;
        sparrow.type = "Sparrow";
        // The client can decide the sparrow will fly slow or fast
        // This is dependency inversion
        sparrow.plugFlyator(new FastFlyator());
        sparrow.makeFly();

        Peacock peacock = new Peacock();
        peacock.color = "Blue";
        peacock.weight = 150;
        peacock.type = "Peacock";
        peacock.plugFlyator(new SlowFlyator());
        peacock.makeFly();
    }
}
