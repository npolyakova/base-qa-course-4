import java.util.Scanner;

public class Homework4 {

    //���� ��� ������������ ����� a, b, c. ���������:
    //1. ����������� �� ����������� a < b < c;
    //2. ����������� �� ����������� b > a > c.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� a");
        double a = sc.nextDouble();
        System.out.println("������� b");
        double b = sc.nextDouble();
        System.out.println("������� c");
        double c = sc.nextDouble();

        if(a<b && b<c){
            System.out.println("����������� a < b < c �����������");
        }
        else if (b>a && a>c){
            System.out.println("����������� b > a > c �����������");
        }
        else {
            System.out.println("�� ���� ����������� �� �����������");
        }
    }
}
