import java.util.Scanner;
import java.util.Random;
public class numberGame {
    public static int playerNumber, chances = 3,value;
    public int returnRandomvalue(){
        Random randomValue = new Random();
        value = randomValue.nextInt(100)+1;//this will generate the random values between 1 to 100.
        return value;
      
    }
   
    public void check(int val,int userval){
        Scanner  input = new Scanner(System.in);
        if(chances<=3 && chances!=0){//base condition.
            if(userval== val){
                if(chances == 2){
                    System.out.println("YOU WON!");
                    System.out.println("Your Score "+ 100);
                }
                if(chances ==1){
                    System.out.println("YOU WON!");
                    System.out.println("Your Score "+ 50);
                }
                if(chances ==0){
                    System.out.println("YOU WON!");
                    System.out.println("Your Score "+ 25);
                }
               
            }
            if(userval > val){
                System.out.println("Your guess value is grater then the system value");
                System.out.println("You have only "+chances+" remaining");
                chances--;
                System.out.println("Try again");
            
                check(val, userval = input.nextInt());
            }
            if(userval< val){
                System.out.println("Your guess value is less then the system value");
                System.out.println("You have only "+chances+" remaining");
                chances--;
                System.out.println("Try again");
                
                check(val, userval = input.nextInt());
            }
        }
        else{
            System.out.println("You lose the game\nBetter luck next time !");
           
        }
      

    }
    public static void main(String[] args) throws Exception {
        numberGame obj = new numberGame();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Computer will generate a number between a 1 to 100, so you hava to guess that number in 3 chances");
        System.out.println("Enter the number now");
        playerNumber = input.nextInt();
        chances--;
        int k = obj.returnRandomvalue();
        System.out.println(k);
        obj.check(k, playerNumber);


        

    }
}
