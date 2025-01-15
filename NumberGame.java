import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    
    public static void main(String args[]){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while(true){ //loop for replayability
            int num = random.nextInt(100)+1; //generates random number from 1 to 100
            
            System.out.println("A random number has been chosen\nGuess the number between 1 to 100");
            
            while(true){
                
                System.out.println("Enter your guess: ");
                
                //validates int input
                if(!sc.hasNextInt()){
                    System.out.println("Invalid Input");
                    sc.next();
                    continue;
                }
                int guess = sc.nextInt();
                
                
                if(guess == num){
                    System.out.println("Your guess is correct. The number is: " + num);
                    
                    //for replayability
                    System.out.println("Do you want to play again? yes/no");
                    String response = sc.next().toLowerCase();
                    if(response.equals("yes")){
                        System.out.println("Okay, restarting...");
                        break; //returns to outer loop
                    }
                    else if(response.equals("no")){
                        System.out.println("Thank you for playing :)");
                        sc.close();
                        return; //exits out of the loop
                    }
                }
                
                else if(guess > num){
                    System.out.println("Your guess is higher than the number. Try Again");
                }
                else if(guess < num){
                    System.out.println("Your guess is lower than the number. Try Again");
                }
            }
        }
    
    }
}
