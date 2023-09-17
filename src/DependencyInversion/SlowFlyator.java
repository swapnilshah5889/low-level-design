package DependencyInversion;

public class SlowFlyator implements Flyator {
    @Override
    public void makeFly() {
        System.out.println("Slow Fly");
    }
}
