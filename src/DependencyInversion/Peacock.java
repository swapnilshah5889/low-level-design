package DependencyInversion;

public class Peacock extends Bird implements Fly{
    Flyator ftor;

    void plugFlyator(Flyator flyator) {
        this.ftor = flyator;
    }

    @Override
    public void makeFly() {
        ftor.makeFly();
    }

}
