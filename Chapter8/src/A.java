public class A {
    int i, j;
    void showij () {
        System.out.println("i и j: " + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk() {
        System.out.println("k:"+ k);
    }
    void sum() {
        System.out . println ( " i+j +k: "+ ( i +j+k) );
    }
}
class Simpleinheritance {
    public static void main(String args[]) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb:");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("содержимое объекта sudoOb:");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("сумма i,j и k в объекте sudoOb");
        subOb.sum();

    }
}
