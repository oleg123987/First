import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        sample(3,5);
        sample(10,15);
        sample();
        int s = sample1(3,10);
        System.out.println(s);
    }

    public static void sample(int x, int y) {
        System.out.println("x = " + x + "; y = " + y);
    }

    public static int sample1(int a, int b) {
        return a + b;
    }

    public static void sample() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение X... ");
        int X = in.nextInt();
        System.out.println("Введите значение Y... ");
        int Y = in.nextInt();
        System.out.println("Введите действие");
        String operation = in.next();
        in.close();
        System.out.printf("Действие %s Значение X = %d Значение Y = %d\n", operation, X, Y);
        System.out.print(operation + " " + X + " и " + Y);
    }

}
