import java.util.Scanner;

public class Homework3 {

    //���� ���������� �����. ����������: ������� �� ������� �������� �� �������, ��������� ������� ������ �� �������
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double unit = number%10;
        double decimal = number/10;
        System.out.println("������� �� ������� �������� �� ������� - " + decimal/unit);
        System.out.println("��������� ������� ������ �� ������� - " + unit/decimal);
    }
}
