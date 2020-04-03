import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Files {

    public static void main(String[] args) throws Exception {
//        FileWriter fw = new FileWriter("C:\\Users\\Олег\\IdeaProjects\\First\\resources\\file.txt");
//        fw.write("Hello world!!!");
//        fw.close();
        ///    writeAnswer("C:\\Users\\Олег\\IdeaProjects\\First\\resources\\file.txt", 5, 10);
        //  writeAnswer(5,10);
        //  FileWriter fw = new FileWriter("C:\\Users\\Олег\\IdeaProjects\\First\\resources\\file.txt");
        int x = 10;
        int y = 1;
        String p = "C:\\Users\\Oleg\\IdeaProjects\\First\\resources\\file.txt";
        newFile(p, x, y);
//        newFile("C:\\Users\\Олег\\IdeaProjects\\First\\resources\\file1.txt", 10, 1);

//        plusMinus(3, 5);

//        FileReader fr = new FileReader("C:\\Users\\Олег\\IdeaProjects\\First\\resources\\file.txt");
//        Scanner in = new Scanner(fr);
//        String content = in.nextLine();
//        System.out.println(content);
//        in.close();
//        fr.close();
    }

    private static void plusMinus(int x, int y) {
        x += 1; // x = x + 1
        y -= 1;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(y); // 8
        System.out.println(--y); // 7
        System.out.println(y--); // 7
        System.out.println(y); // 6
    }

    public static void newFile(String path, int x, int y) throws Exception {
        FileWriter nFile = new FileWriter(path);

        for (int i = x; i >= y; i--) {
            String st = i + " ";
            nFile.write(st);
        }

        nFile.close();
    }

}

class Temp {

}
