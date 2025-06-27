import java.util.Random;
import java.util.Scanner; 

public class DiceGame{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

      
        System.out.println("What is your name?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!"); 


       Random random = new Random();

       System.out.println("Rolling dice ...");
       int die1 = random.nextInt(6)+1;
       int die2 = random.nextInt(6)+1;
       int total = die1 + die2;

       System.out.println("Die 1: "+ die1);
       System.out.println("Die 2: "+ die2);
       System.out.println("Total value: "+total);

        scanner.close();
   }
}