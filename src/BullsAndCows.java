import java.util.ArrayList;
import java.util.Scanner;

public class BullsAndCows {
    public static void main(String[] args) {

        // блок генерации случайного загаданного числа
        ArrayList<Integer> answer = new ArrayList<>(); // Создаем список "answer"
        while (answer.size() < 4) { // До тех пор, пока не сгенерируем ровно 4 случайных и уникальных числа
            int r = (int) (Math.random() * 9); // Генерируем случайное челое число
            if (!answer.contains(r)) { // если список "answer" содержит такое же число, генерировать заново
                answer.add(r); // если список ещё не содержит это число, то добавляем его в этот список
            }
        }
        System.out.println("Computer: " + answer); // выводим список со случайными числами (ответом)

        Scanner in = new Scanner(System.in); // Создаем экземляр сканнер для чтения из консоли

        while (true) {
            ArrayList<Integer> guess = new ArrayList<>(); // список для чисел из строки от пользователя
            System.out.println("Введите 4-х значное число (без пробелов)... ");
            String input = in.nextLine(); // введенное число сохраняем в переменную input

            if (input.length() > 4) { // если кол-во символов в строке больше нужного
                System.out.println("Введено более 4 символов");
            } else if (input.length() < 4) { // если кол-во символов в строке меньше нужного
                System.out.println("Введено менее 4 символов");
            } else { // если длина строки равна 4
                boolean isNotDigit = false; // считаем, что в строке только числа
                for (char c : input.toCharArray()) { // перебираем все символы в строке
                    // 1) символ - число? 2) число ещё не содержится в списке? -> если да-да, то
                    if (Character.isDigit(c) && !guess.contains(Integer.parseInt(String.valueOf(c)))) {
                        // добавляем в список новое число, преобразованное из символа
                        guess.add(Integer.parseInt(String.valueOf(c)));
                    } else {
                        isNotDigit = true; // теперь считаем, что в строке есть не числа
                    }
                }
                if (isNotDigit) { // если в строке есть не числа, отправляем пользователя на новую попытку ввода
                    System.out.println("Вы ввели не числа либо не уникальные числа, повторите");
                    continue; // перебрасывает на начало цикла while
                }
                if (input.matches("\\d{4}")) {
                    System.out.println("Вы ввели 4 числа");
                    System.out.println("Your guess: " + guess);
                }

                if (answer.equals(guess)) {
                    System.out.println("You win!");
                    break; // прерывает цикл while, пользователь отгадал число
                }

                int bulls = 0;
                int cows = 0;
                for (int i = 0; i < 4; i++) {
                    if (answer.get(i).equals(guess.get(i))) {
                        bulls += 1;
                    } else if (answer.contains(guess.get(i))) {
                        cows += 1;
                    }
                }
                System.out.println("Cows: " + cows + " " + "Bulls: " + bulls);
            }
        }
        in.close();

    }

}
