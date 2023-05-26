public class Box3 {
    double width;
    double height;
    double depth;
    double volume() {
        return  width * height * depth;
    }

}

class BoxDemo3 {
    public static void main (String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.widht = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox1.widht = 3;
        mybox1.height = 6;
        mybox1.depth = 9;
        vol = mybox1.volume();
        System.out.println("объем равен " + vol);
         vol = mybox2.volume();
        System.out.println("объем равен " + vol);

    }
 }
