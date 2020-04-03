
public class Solution {
    /*
    sumRange должен возвращать сумму чисел, значения которых между 10 и 100 (включительно)
    и принадлежащих к массиву ints.
     */
    public static void main(String[] args) {
        int[] ints = {1, 20, 3, 10, -2, 100};
        int s = sumRange(ints); // =130
        System.out.println(s);
        ints = new int[]{1, 200, 300, 10, -2, 10, -3, 15};
        System.out.println(sumRange(ints)); // =35

        int n = 1;
        for (int element : ints) {
            System.out.println(n++ + ") " + element);
        }
    }

    public static int sumRange(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if (n >= 10 && n <= 100) {
                sum += n;
            }
        }
        return sum;

    }

//    @Test
//    public void test() {
//        Assert.assertEquals
//    }
}
