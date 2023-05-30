// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {// ООП: классы и объекты
        Trensport bmw = new Trensport();
        bmw.setValues(250.5f, 2500, "Black", new byte[] {0,0,0});
        String res1 = bmw.getValues();
        System.out.println(res1);
        /*
        bmw.speed= 250.5f;
        bmw.weight = 2500;
        bmw.color = "Black";
        bmw.coordinate = new byte[] {0,0,0};
    */

        Trensport opel = new Trensport();
        opel.speed = 180.5f;
        opel.weight = 1500;
        opel.color = "Blue";
        opel.coordinate = new byte[] {100,0, 100};
        System.out.print ("Opel speed" + opel.speed + "BMW speed" + bmw.speed);

        String res2 = opel.getValues();
        System.out.println(res2);


    }
}



