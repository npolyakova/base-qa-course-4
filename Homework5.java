import java.util.Scanner;

public class Homework5 {
    //���� ��� �����. ���� ���������� ������ �� ������� ����� ������ ������� �����,
    // �� ��������� ������ ����� � ���� ���.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("������� a");
        int a = sc.nextInt();
        System.out.println("������� b");
        int b = sc.nextInt();

        if (Math.sqrt(b) < a){
            b *= 5; //b = b * 5
        }

        System.out.printf("������ ����� - %d, ������ ����� - %d", a, b);
        System.out.println("������ ����� - " + a + " ������ ����� - " + b);
        System.out.print("������ ����� - " + a + " ������ ����� - " + b);
    }
}
