import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
        final int Employees = 3 ;
        int [] hours = new int[Employees];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the hours of work by " + Employees+ "employees.");
        for (int index = 0; index < Employees; index ++){
            System.out.print("employees "  +(index + 1)+ " : ");
            hours[index] = in.nextInt();
        }
        System.out.println("The hours your entered are : ");
        for (int index = 0; index < Employees; index ++){
            System.out.println(hours[index]);
        }
    }
}
