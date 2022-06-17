import java.util.Scanner;

public class FunctionsWithParams {

    public static void main(String[] args) { //главная функция main, пишется всегда одинаково
        Scanner sc = new Scanner(System.in); //создание сканера, чтобы потом можно было вводить данные через терминал
        int a = sc.nextInt(); //ввод числа а
        int b = sc.nextInt(); // ввод числа b
        sum(a,b); // вызываем функцию sum с параметрами a и b
    }

    public static void sum(int firstNumber, int secondNumber){ //наша функция для подсчета суммы
        System.out.println(firstNumber+secondNumber); //вывод сумму параметров firstNumber и secondNumber
    }
}
