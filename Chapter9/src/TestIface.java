import javax.security.auth.callback.Callback;

public class TestIface {
    public static void main(String args[]) {
        Callback c = new Client ();
        c.callback (42);
    }
}
