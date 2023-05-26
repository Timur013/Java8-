public class Box1 {
    double widht;
    double heigth;
    double depth;
    void volume() {
        System.out.print("объем равен ");
        System.out.println(widht*heigth*depth);
    }
}
class BooxDemo2{
    public static void main(String args[]){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.widht = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.widht = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        mybox1.volume();
        mybox2.volume ();
    }
}
