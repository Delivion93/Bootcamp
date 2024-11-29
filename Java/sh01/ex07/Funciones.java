import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the first number");
        int first = scanner.nextInt();
        System.out.println("input the second number");
        int second = scanner.nextInt();
        System.out.println("result of sum(first,second) is "+sum(first, first));
    }
    public static int sum(int a, int b){
        return a+b;
    }
}
