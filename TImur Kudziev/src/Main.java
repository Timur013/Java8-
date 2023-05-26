import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace cha
      public class Main {

    class Promote {
        public static void main(String[] args) {
            // Press Alt+Enter with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            System.out.print("Привет Мир!");
            System.out.println("\\Тимур\"учится \nу\t Жени\"");
            //переменные и данные
            byte a = 120; // от -128 до 127
            short b = 2000; // от 32768 до 32767
            int c = 963742; // от 2147483648 до 2147483647
            long d = 45646545;// от -9223372036854775808 до 9223372036854775807

            int age = 21;
            System.out.println("Возраст:" + age + ".");

            double e = 47.6;
            float f = 47.256f;
            boolean g = false;// истина ложь
            byte Ь = 50;
            Ь = (byte) (Ь * 2);
        }
    }


    public class Tim {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите ваше имя: ");
            String username = scan.nextLine();
            System.out.println("Привет, + username");
            int num = scan.nextInt();
            byte num2 = scan.nextByte();
            boolean num3 = scan.nextBoolean();
            float num4 = scan.nextFloat();

            short kek1 = 50, kek2 = 10;// целочисленые типы данных
            int res = kek1 / kek2;
            System.out.println("Результат:" + res);

            float lol1 = 50, lol2 = 10;
            float resa = lol1 % lol2;
            resa += 10;
            resa = res + 10;
            resa++;
            System.out.println("Результат:" + resa);

        }
    }
}

















    








