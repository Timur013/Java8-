public class A {
    final void meth() {
        System.out.println("Недопустимо!");
    }
}
class B extends A {
    void meth() {
        System.out.println("Недопустимо");
    }
}
