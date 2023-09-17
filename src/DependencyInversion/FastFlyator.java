package DependencyInversion;

public class FastFlyator implements Flyator{
    @Override
    public void makeFly() {
        System.out.println("Fast Fly");
    }
}
