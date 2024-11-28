
import java.util.Scanner;


// Ejercicio 4: Condicionales
// Escribe un programa que tome un número entero como entrada (solicitado al
// usuario) y determine si es positivo, negativo o cero. Llama a la clase
// Condicionales .
public class Condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("put the number");
        int number = scanner.nextInt();
        if(number>0){
            System.out.println("number is positive");
        }
        else if(number<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is 0");
        }
    }
}
