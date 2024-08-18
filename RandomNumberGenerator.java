import java.util.Scanner;
import java.util.Random;
class RandomNumberGenerator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Random random =new Random();
        
        
        boolean playAgain=true;
        while(playAgain){
            int guessed=0;

            int guess=random.nextInt(100)+1; //random number generated from 1 to 100
            int limit=10; //maximum number of attempts
            int i=0;


            System.out.println("Welcome to the game of Number guessing!");
            System.out.println("You have a maximum of "+limit+" attempts to guess the number.");
            System.out.println("Good luck trying :)");
            System.out.println("*************************************");


            while(i < limit && guessed != 1){

                

                System.out.println("Enter a number between 1 to 100");
                int n=sc.nextInt();
                i++;
    
                if(n==guess){
                    guessed =1;
                    System.out.println("CONGRATULATIONS!\n You have guessed the correct number!");
                    System.out.println("You have taken "+i+" attempts to complete the game.\n");
    
                }
                else if(n<guess){
                    System.out.println("Sorry!\nToo Low. Try again!\n");
    
    
                }
                else{
                    System.out.println("Sorry!\nToo High. Try again!\n");
    
                }
    
            }

            if(i>=limit && guessed!=1){
                System.out.println("Sorry!\nYou have lost the game!\n");

            }

            System.out.println("Do you want to play again? (Yes/No)");
            String ans=sc.next();
            if(ans.equalsIgnoreCase("No")){
                playAgain=false;
            }




        }

        System.out.println("Thanks for playing!");
        sc.close();

        

        

        


    }
}