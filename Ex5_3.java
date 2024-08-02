import java.util.Scanner;

public class Ex5_3 {

   public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input your first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input your second number: ");
        int num2 = scanner.nextInt();

        
        int max = findMax(num1, num2);

        
        System.out.println("The highest value between" + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}

    