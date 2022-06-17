public class Functions {

    public static void main(String[] args) {
        myFunction();
        int result = myFunction2();
    }

    public static void myFunction(){
        System.out.println("Hello world");
    }

    public static int myFunction2(){
        System.out.println(10+20);
        return 10 + 20; //можно без переменных
    }

}
