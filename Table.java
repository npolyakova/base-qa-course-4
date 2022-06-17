public class Table {

    public static void main(String[] args) {
        //1+1 1+2 1+3 .. 1+9
        //2+1 2+2 2+3
        //9+1
        for (int i = 1; i<10; i++){ //1, 2, 3, 4, 5, 6, 7, 8, 9
            for (int j = 1; j<10; j++){
                System.out.print(i+"+"+j+" ");
            }
            System.out.println();
        }
    }
}
