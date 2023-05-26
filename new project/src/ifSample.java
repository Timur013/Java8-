public class ifSample {
    public static void main (String[] args) {
        int x, y;

        x = 5;
        y = 10;
        if (x < y)
        System.out.println("x < y");

        x *=2;
        if (x == y)
        System.out.println("x = y");

        x *=2;
        if (x > y)
            System.out.println("x > y");

        if (x == y)
            System.out.println("тут ничего нет");

    }
}

