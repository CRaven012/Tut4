public class Main {

    public static int Multiply(int x, int y) {
        int xx = x * 2;
        int yy = y * 2;
        return xx * yy;
    }

    public static int Divide(int x, int y) {
        int divide = 0;
        if (x == 0 | y == 0) {
            return -1;
        } else {
            divide = x / y;
        }
        return divide;
    }

    public static void main(String[] args) {
        System.out.println(Multiply(3, 4));
        System.out.println(Divide(2, 2));
        System.out.println(Divide(3, 0));

    }

}