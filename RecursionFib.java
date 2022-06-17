public class RecursionFib {

    public static void main(String[] args) {
        int k = 6;
        int result = fib(k);
        System.out.println(result);
    }

    //1, 1, 2, 3, 5, 8, 13
    public static int fib(int k){
        int number = 0;
        if (k == 1 || k == 2) {
            number = 1;
        } else {
            number = fib(k - 1) + fib(k - 2); //5-1 5-2
        }
        return number;
    }
}
