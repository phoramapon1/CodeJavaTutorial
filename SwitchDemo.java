import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args){
       int number;
       Scanner keyboard= new Scanner(System.in);
       System.out.println("Enter 1, 2, or 3 : ");
       number = keyboard.nextInt();
       switch (number) {
        case 1:
        System.out.println("Enter your 1 : ");
            break;
        case 2:
        System.out.println("Enter your 2 : ");
            break;
        case 3:
        System.out.println("Enter your 3 : ");
            break;
            default:
            System.out.println("that is not");   
       }
    }
}
