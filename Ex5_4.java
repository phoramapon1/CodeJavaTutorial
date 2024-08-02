import java.util.Scanner;

public class Ex5_4 {

   public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " Even Numbers";
        } else {
            return number + " Odd Number";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Input your number: ");
        int number = scanner.nextInt();

        
        String result = checkEvenOdd(number);

        
        System.out.println(result);

        scanner.close();
    }
}
    

