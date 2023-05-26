public class ClientImplementsCallback {
    public void callback (int p) {
        System.out.println("метод callback(), называемый со значением "+ p);
    }
    void nonIfaceMeth() {
        System.out.println(" В классах, реализующих интерфейсы,"+ "могут определяться другие члены");
    }
}
