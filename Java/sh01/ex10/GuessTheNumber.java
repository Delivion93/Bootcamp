import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(101);
        int userNumber = -1;
        System.out.println("Guess the number between 1-100");
        while(randomNumber!=userNumber){
            System.out.println("input your guess");
            userNumber=scanner.nextInt();
            if(userNumber>randomNumber){
                System.out.println("lower!");
            } else if(userNumber<randomNumber){
                System.out.println("higher!");
            } else{
                System.out.println("You guess it!!! The number was "+randomNumber);
            }
        }
    }
}
