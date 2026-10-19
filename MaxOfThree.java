public class MaxOfThree {
    static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        System.out.println("Max of 7, 15, 3 = " + max(7, 15, 3));
    } // bugfix
}