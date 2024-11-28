// Ejercicio 3: Operaciones Aritméticas
// Escribe un programa que tome dos números enteros como entrada (solicitando

import java.util.Scanner;

// esos números al usuario), realice operaciones aritméticas básicas (suma, resta,
// multiplicación y división) y muestre los resultados. Quizás debas importar el
// paquete de java.util.Scanner . Llama a la clase OperacionesAritmeticas .
public class OperacionesAritmeticas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the first digit");
        double firstNumber=scanner.nextDouble();
        System.out.println("put the second digit");
        double secondNumber=scanner.nextDouble();
        System.out.println("result of summ "+(firstNumber+secondNumber));
        System.out.println("result of sub "+(firstNumber-secondNumber));
        if(secondNumber==0){
            System.out.println("you cant divide by 0");
        }
        else{
            System.out.println("result of div "+(firstNumber/secondNumber));
        }
        
        System.out.println("result of mul "+(firstNumber*secondNumber));
        
    }
    

}
