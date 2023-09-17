package DependencyInversion;

public class Sparrow extends Bird implements Fly{
    Flyator ftor;

    Sparrow(Flyator f) {
        if(f == null) {
            throw new IllegalArgumentException("Flyator object cannot be null");
        }
        this.ftor = f;
    }

    void plugFlyator(Flyator flyator) {
        this.ftor = flyator;
    }

    @Override
    public void makeFly() {
        ftor.makeFly();
    }
}
