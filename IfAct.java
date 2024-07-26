import java.util.Scanner;

public class IfAct{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter your score: ");
        int score = scanner.nextInt();
        if (score > 60) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are not pass");
        }
        
       
        scanner.close();
    }
}
       
        
       
        
