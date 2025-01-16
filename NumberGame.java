import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    
    public static void main(String args[]){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = random.nextInt(100)+1; //generates random number from 1 to 100
            
            System.out.println("A random number has been chosen\nGuess the number between 1 to 100 within 10 guesses");
        
            game(sc, num);
            
                while(true){
                    System.out.println("Do you want to play again? yes/no");
                    String response = sc.next().toLowerCase();
                    if(response.equals("yes")){
                        System.out.println("Okay, restarting...");
                        break; //restarts
                    }
                    else if(response.equals("no")){
                        System.out.println("Thank you for playing :)");
                        sc.close();
                        return; //exits out of the loop
                    }
                    else{
                        System.out.println("Invalid Response");
                    }
                }
            }

        }
        

    public static void game(Scanner sc, int num){
        int count = 0;
        while(count<10){
            System.out.println("Enter your guess: ");
            
            //validates int input
            if(!sc.hasNextInt()){
                System.out.println("Invalid Input");
                sc.next();
                continue;
            }
            int guess = sc.nextInt();
            count++;
            

            if(guess == num){
                System.out.println("Your guess is correct. The number is: " + num + " and your Guess Count was: " + count);
                return;
            }
            
            else if(guess > num){
                System.out.println("Your guess is higher than the number. Try Again. Guess Count: " + count);
            }
            else if(guess < num){
                System.out.println("Your guess is lower than the number. Try Again. Guess Count: " + count);
            }
        }
        System.out.println("You ran out of guesses. The number was: "+ num);
        return;
    }
}