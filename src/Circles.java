import java.io.FileReader;
import java.util.Scanner;

public class Circles {
    public static void main(String[] args) throws Exception {

//        for (int i = 10; i >= 1; i--) {
//            System.out.print(i);
//            System.out.print(" ");
//        }
//        System.out.println();
//        for (int i = 1; i < 10; i += 2) {  //Нечетные от 1 до 10
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 2; i <= 10; i += 2) { //четные от 2 до 10
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i = 0; i <= 10; i++) { //Нечетные от 1 до 10
//            if (i % 2 > 0) { // % - это остаток от деления
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i <= 10; i++) { //Четные от 2 до 10
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.println(3 % 2);
//        System.out.println(6 % 2);
//        System.out.println(7 % 5);
//
//        int x = 0; // подсчет суммы от 0 до 10
//        for (int i = 0; i <= 10; i++) {
//            x += i;
//        }
//        System.out.println(x);
//
//        x = 1; // подсчет факториала 10
//        for (int i = 1; i <= 10; i++) {
//            x *= i;
//        }
//        System.out.println(x);

        //FileReader fr = new FileReader("C:\\Users\\Олег\\IdeaProjects\\First\\resources\\file.txt");
        FileReader fr = new FileReader("resources/file.txt");
        Scanner in = new Scanner(fr);
        String content = in.nextLine();
        String[] xxx  = content.split(", ");

        for (int i = 0; i < xxx.length; i++) {
            System.out.print(xxx[i] + " ");
        }
        System.out.println();
        for (int i = xxx.length - 1; i >= 0; i--) {
            System.out.print(xxx[i] + " ");
        }

        in.close();
        fr.close();
        System.out.println();

        int[] a = {15, 16, 20, 50, 73, 85};



//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i] + " ");
//        }
        for (int i = 0; i < a.length; i++) { // Нечетные

            if (a[i] % 2 != 0) { // % - это остаток от деления
                System.out.print(a[i] + " ");
            }
//        System.out.println("\n" + a[1]);
        }

        System.out.print("\n");

        for (int i = 0; i < a.length; i++) { // Четные
            if (a[i] % 2 == 0) { // % - это остаток от деления
                System.out.print(a[i] + " ");
            }
        }
        System.out.print("\n");

        int sum = 0;
        for (int i = 0; i < a.length; i++) { // Сумма всех элементов массива
            // sum = sum + a[i];
            sum += a[i];
        }
        System.out.println(sum);

        for (int i = 1; i < a.length; i += 2) { // Элементы по нечетным индексам
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < a.length; i++) { // Элементы по четным индексам
            if (i % 2 == 0) { // Проверка индекса на четность
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        // 0) 15; 1) 16; 2) 20
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + ") " + a[i] + "; ");
        }

    }
}
