import java.util.Scanner;
public class calnum {
    public static void main(String[] args){
        int x,y;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number 1 : ");
        x = in.nextInt();
        System.out.println("Your number is " +x);
        System.out.print("Input number 2 : ");
        y = in.nextInt();
        System.out.println("Your number is " +y);
        System.out.println(x+ "+" +y+ " = " +(x+y));

    }
}
