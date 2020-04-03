import org.junit.Assert;
import org.junit.Test;

public class SortPackages {

    public static void main(String[] args) {
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

    @Test
    public void testSolve() {
        Assert.assertEquals("STANDARD", solve(10, 10, 10, 15));
        Assert.assertEquals("SPECIAL", solve(10, 150, 10, 15));
        Assert.assertEquals("SPECIAL", solve(100, 100, 100, 15));
        Assert.assertEquals("SPECIAL", solve(150, 150, 150, 15));
        Assert.assertEquals("SPECIAL", solve(10, 10, 10, 25));
        Assert.assertEquals("REJECTED", solve(150, 150, 150, 20));
    }


}
