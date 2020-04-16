import java.util.ArrayList;
import java.util.Arrays;

public class While {
    public static void main(String[] args) {

        /*ArrayList<Integer> answer = new ArrayList<>(); // Создаем список "answer"
        answer.add(0);
        answer.add(7);
        answer.add(6);
        answer.add(5);
//        guess.add(7, 0, 3, 5); */

        ArrayList<Integer> answer = new ArrayList<>(Arrays.asList(0, 7, 6, 5));
        ArrayList<Integer> guess = new ArrayList<>(Arrays.asList(7, 0, 3, 5));
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < 4; i++) {
            //System.out.print(guess.get(i) + " - ");
            //System.out.println(answer.get(i));
            if (answer.get(i).equals(guess.get(i))) {
                bulls += 1;
            } else if (answer.contains(guess.get(i))) {
                cows += 1;
            }
        }
        System.out.println(cows + " " + bulls);


        /*
        while (true) {

            System.out.println("hi");
            break;
            //continue;
        }

        int i = 0;
        do {
            i++;
            System.out.println("hi");
        } while (i < 5);

         */
    }
}
