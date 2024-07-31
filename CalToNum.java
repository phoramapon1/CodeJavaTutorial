import java.util.Scanner;
public class CalToNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu : ");
        System.out.println("1. Plus");
        System.out.println("2. Times");
        System.out.println("3. Divide");
        System.out.println("4. Minus");
        System.out.print("Please choice (1-4): ");
        
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Total is : " + result);
                break;
            case 2:
                result = number1 * number2;
                System.out.println("Total is: " + result);
                break;
            case 3:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Total is: " + result);
                } else {
                    System.out.println("Not found");
                }
                break;
            case 4:
                result = number1 - number2;
                System.out.println("Total is: " + result);
                break;
            default:
                System.out.println("choose the wrong menu ");
                break;
        }

    }
}  
