import java.util.*;
 class Game{
    int roboGuess;
    int userInput;
    int guess =0;
    Game(){
        Random rm = new Random();
        this.roboGuess=rm.nextInt(100);
    }
    void takeinput(){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
    }
    boolean isCorrectUserInput(){
        guess++;
        if(userInput == roboGuess){
            System.out.println("You guessed it right, it was "+roboGuess+" at attempt "+guess);
            return true;
        }
        else if(userInput<roboGuess){
            System.out.println("too small...");
        }
        else if(userInput>roboGuess){
            System.out.println("too high.....");
        }
        return false;
    }
}
public class guessingGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeinput();
            b = g.isCorrectUserInput();
        }
    }
}
