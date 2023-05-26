public class Box {
    double widht;
    double height;
    double depth;

}
class BoxDemo {
    public static void main (String args[]) {
        Box mybox = new Box();
        double vol;
        mybox.widht = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.widht * mybox.height * mybox.depth;
        System.out.println("объем равен" + vol);
    }
}
