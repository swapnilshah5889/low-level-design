package Final;

public class Client {
    public static void main(String[] args) {

        // Local variables can be left un initialized
        final int x;
        // Can be initialized once
        x = 0;

        // Not allowed, will give an error
        //x++;
        //x=2;
    }
}
