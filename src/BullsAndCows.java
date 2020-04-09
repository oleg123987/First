import java.util.ArrayList;
import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {

        ArrayList<Integer> answer = new ArrayList<>();
        while (answer.size() < 4) {
            int r = (int) (Math.random() * 9);
            if (!answer.contains(r)) {
                answer.add(r);
            }
        }
        System.out.println(answer);

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Введите 4-х значное число... ");
            String number = in.nextLine();

            if (number.length() > 4) {
                System.out.println("Введено более 4 символов");
            } else if (number.length() < 4) {
                System.out.println("Введено менее 4 символов");
            } else {
                ArrayList<Integer> guess = new ArrayList<>();
                boolean isNotDigit = false;
                for (char i : number.toCharArray()) {
                    if (Character.isDigit(i) && !guess.contains(Integer.parseInt(String.valueOf(i)))) {
                        guess.add(Integer.parseInt(String.valueOf(i)));
                    } else {
                        isNotDigit = true;
                    }
                }
                if (isNotDigit) {
                    System.out.println("Вы ввели не числа либо не уникальные числа, повторите");
                    continue;
                }
                if (number.matches("\\d{4}")) {
                    System.out.println("Вы ввели 4 числа");
                    System.out.println(guess);
                    break;
                }
            }
        }
        in.close();
        // сделать проверку уникальности чисел


        
/*
        String stack = "";
        if (random_number222 == aaa) stack = "";
        if (random_number333 == bbb) stack = "";
        System.out.println(stack);
//        return stack;

        if( random_number111 == aaa){
            System.out.println("Совпало!!!");
        }

        do {
            System.out.println("Совпало!!!");
        } while (random_number333 == aaa);

*/

    }


}
