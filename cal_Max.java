import java.util.Scanner;

public class cal_Max {
    public static void main(String[] args) {
        int num1, num2;
        Scanner stdin = new Scanner(System.in);
        System.out.println("input number 1 : ");
        num1 = stdin.nextInt();
        System.out.println("input number 2 : ");
        num2 = stdin.nextInt();
        int larger = TestMax.max(num1, num2);
        System.out.println("Max Data is " +larger);
        }
}
