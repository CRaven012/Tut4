public class SampleMain{

    public static int add(int x, int y){
        return x+y;
    }

    public static int subtract(int x, int y){
        return x-y;
    }

    public static int Multiply(int x, int y) {
        int xx = x;
        int yy = y;
        return xx * yy;
    }

    public static int Divide(int x, int y) {
        int divide = 0;

        if(y == 0){
            return -1;
        } else {
            divide = x/y;
        }

        return divide;
    }

    public static void main(String[] args) {
        System.out.println(add(8, 9));
        System.out.println(Multiply(5, 8));
        System.out.println(Divide(2, 2));
        System.out.println(Divide(3, 0));
    }

}