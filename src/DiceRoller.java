import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
   public static void main(String args[]) {
	  System.out.println("Welcom to the Grand Circus Casino!");
	   
      
	  System.out.print("Enter the number of sides of dice: ");
	  
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();

      while (num <= 0) {
         System.out.println("Error");
         System.out.print("Enter number of sides of the dice: ");
         num = scan.nextInt();
      }

      Random rand = new Random();
      do {
         System.out.println("Roll number 1: ");
         for (int i = 0; i < num; i++) {
            System.out.println(rand.nextInt(6) + 1);
         }
         System.out.print("Do you want to roll the" +
                          " dice again? true/false: ");
      } while (scan.nextBoolean() == true);
      scan.close();
   }
}