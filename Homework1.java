import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        //¬ чемпионате по футболу команде за выигрыш даетс€ 3 очка, за проигрыш Ч 0, за ничью Ч 1.
        // »звестно количество очков, полученных командой за игру.
        // ќпределить словесный результат игры (выигрыш, проигрыш или ничь€).
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        switch (result){
            case (0):
                System.out.println("проигрыш");
                break;
            case (1):
                System.out.println("ничь€");
                break;
            case (3):
                System.out.println("выигрыш");
                break;
            default:
                System.out.println("кол-во очков указано неверно");
        }
    }
}
