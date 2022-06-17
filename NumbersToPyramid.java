import java.util.Scanner;

public class NumbersToPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        print5Again(count);
    }

    public static void print5Again(int n){
        Scanner sc2 = new Scanner(System.in);
        String ch = sc2.next();
        String row = "";
        for (int i = 0; i < n; i++){
            row += ch;
            System.out.println(row);
        }
    }
}
