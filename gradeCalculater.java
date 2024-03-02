import java.util.Scanner;
public class gradeCalculater {
    private int mark;
    public void calculateGrade(int marks){
        switch (marks/10) {
            case 10 : 
            case 9 :
            System.out.println("The grade is A*");
                break;
            case 8 :
            System.out.println("The grade is A");
            case 7 :
            System.out.println("The grade is B");
                break;
            case 6:
            System.out.println("The grade is C");
                break;
            case 5:
            System.out.println("The grade is D");
                break;
            case 4:
            System.out.println("The grade is E");
                break;
             
            default:
            System.out.println("Fail better luck NEXT TIME");
        }
    }
    public static void main(String args[]){
        gradeCalculater  obj = new gradeCalculater();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks obtained out of 100 :");
        obj.mark = input.nextInt();
        obj.calculateGrade(obj.mark);
        
    }
}
