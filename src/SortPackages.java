public class SortPackages {

    public static void main(String[] args) {
        solve(10, 10, 10, 15);
        solve(10, 150, 10, 15);
        solve(100, 100, 100, 15);
        solve(150, 150, 150, 15);
        solve(150, 150, 150, 20); // REJECTED!
    }

    public static String solve(int width, int height, int length, int mass) {
        boolean isBulky = width*height*length >= 1000000 || width >= 150 || height >= 150 || length >= 150;
        boolean isHeavy = mass >= 20;
        String stack = "";
        if (!isBulky && !isHeavy) stack = "STANDARD";
        if (isBulky || isHeavy) stack = "SPECIAL";
        if (isBulky && isHeavy) stack = "REJECTED";
        System.out.println(stack);
        return stack;
    }

}
