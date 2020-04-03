import java.util.Arrays;
import java.util.Scanner;

public class Circles2D {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int[][] b = new int[5][5];

        /*for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + ") ");
            for (int j = 0; j < 5; j++) {
                a[i][j] = 1;
//                System.out.print(a[i][j] + " ");
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }
        System.out.println();

        int counter = 1;
        for (int k = 0; k < 5; k++) {
            for (int m = 0; m < 5; m++) {
                b[k][m] = counter++;
//                System.out.print(k + ":" + m + " ");
            }
            //System.out.println();
        }

        for (int k = 0; k < 5; k++) {
            for (int m = 0; m < 5; m++) {
                b[k][m] = k*5 + m+1;
//                System.out.print(k + ":" + m + " ");
            }
            //System.out.println();
        }

        for (int[] array : b) {
            System.out.println(Arrays.toString(array));
        }


//        .*.*.
//        *.*.*
//        .*.*.
//        *.*.*
//        .*.*.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение n ");
        int n = in.nextInt();
        in.close();
        generateMatrix(n);
        generateMatrix(3);
        generateMatrix(7);
        generateMatrix(7, 3);
        generateMatrix(3, 7);*/
        char[][] test = generateMatrix(2, 4, "");
        for (char[] line : test) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void generateMatrix(int p) {
        generateMatrix(p, p);
    }

    public static char[][] generateMatrix(int n, int k, String path) {
        char[][] matrix = new char[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if ((i + j) % 2 > 0) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = '.';
                }
            }
        }
        return matrix;
    }

    public static void generateMatrix(int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if ((i + j) % 2 > 0) {
                    System.out.print('*');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
