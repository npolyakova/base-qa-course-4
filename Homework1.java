import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        //� ���������� �� ������� ������� �� ������� ������ 3 ����, �� �������� � 0, �� ����� � 1.
        // �������� ���������� �����, ���������� �������� �� ����.
        // ���������� ��������� ��������� ���� (�������, �������� ��� �����).
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        switch (result){
            case (0):
                System.out.println("��������");
                break;
            case (1):
                System.out.println("�����");
                break;
            case (3):
                System.out.println("�������");
                break;
            default:
                System.out.println("���-�� ����� ������� �������");
        }
    }
}
