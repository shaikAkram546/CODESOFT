import java.util.Scanner;
 class bankAccount {
    private double balance;
    public int pin;
    bankAccount(double price, int pin){
        this.balance = price;
        this.pin = pin;
    }
    public void deposit(double amount ){
        this.balance += amount;
        System.out.println("The Amount depocited sucessfully ");
    }
    public double checkBalance(){
        return this.balance;
    }
    public boolean canWithDraw(double price){
         if(this.balance>0 && this.balance>=price){
             return true;     
         }
         else {
            return false;
         }
    }
    public void withDraw(double price){
        
        this.balance-=price;
        System.out.println("The WithDraw was sucessfull ");
    }
}
class ATM{
    bankAccount userAccount;
    int pin,option;
    ATM(bankAccount userAccount){
        this.userAccount = userAccount;
       
    }
    
    Scanner input = new Scanner(System.in);
    public void setPin(){
       System.out.println("Hello This is ATM machine. For  ATM operations Enter your PIN : ");
       
         pin = input.nextInt();
    }
    
    public void Transation(){
        
        if(pin == userAccount.pin){
           do{
                System.out.println("1.Check Balance\n2. With Draw Amount\n3. Deposit Amount\n4. Cancel");
                 option = input.nextInt();
                switch(option){
                    case 1 :
                       System.out.println("You balance is " + userAccount.checkBalance()) ;
                        break;
                    case  2:
                        System.out.println("Enter the amount to withDraw  :  ");
                        int price = input.nextInt();
                        
                        if(userAccount.canWithDraw(price)){
                            userAccount.withDraw(price);
                        }
                        else{
                            System.out.println("The Amount is insuffecient");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("Enter the amount to deposit :  ");
                        int price1 = input.nextInt();
                        userAccount.deposit(price1);
                        break;
                    case 4:
                        System.out.println("Thank you ----  COME AGAIN");
                        break;
                        
                     
                    default:
                        System.out.println("Enter proper option ");
                        break;

                    
                }
            }while(option!= 4);
        }
        else {
            System.out.println("Wrong pin Entered.");
        }
    }




}
class Main{
    private static Object bankAccount;

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("The new Bank Accunt is created for you. Now you have to Deposit some amount in the account and set your ATM card pin number okay ");
        System.out.println("Deposit some amount in the new Account : ");
        double Amount = input.nextDouble();
        System.out.println("Set your ATM card pin  :");
        int pin = input.nextInt();
        bankAccount Account1 = new bankAccount(Amount, pin);
        ATM obj = new ATM(Account1);
        obj.setPin();
        obj.Transation();
        


    }
}