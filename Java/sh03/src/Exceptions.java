public class Exceptions {
    public static void main(String[] args) {
        divide(6,2);
        divide(5,0);
    }
    public static void divide(int a, int b){
        try {
            int result = a/b;
            System.out.println("result is "+result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: cant divide by 0");
        }
    }
}
