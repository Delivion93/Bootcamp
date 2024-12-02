import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el supuesto polindormo");
        isPolindrom(scanner.nextLine());
    }

    public static void isPolindrom(String text){
        boolean isPolindomo = true;
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                isPolindomo=false;
            }
        }
        if(isPolindomo){
            System.out.println("Si! es un Polindromo");
        }else {
            System.out.println("no es un Polindromo");
        }
    }
}
