import java.util.Scanner;

public class FunctionsWithParams {

    public static void main(String[] args) { //������� ������� main, ������� ������ ���������
        Scanner sc = new Scanner(System.in); //�������� �������, ����� ����� ����� ���� ������� ������ ����� ��������
        int a = sc.nextInt(); //���� ����� �
        int b = sc.nextInt(); // ���� ����� b
        sum(a,b); // �������� ������� sum � ����������� a � b
    }

    public static void sum(int firstNumber, int secondNumber){ //���� ������� ��� �������� �����
        System.out.println(firstNumber+secondNumber); //����� ����� ���������� firstNumber � secondNumber
    }
}
