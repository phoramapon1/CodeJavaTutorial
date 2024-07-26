import java.util.Scanner;
public class Payroll {
    public static void main(String[] args){
        String name;
        int hours;
        double payRate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("what is your name? ");
        name = keyboard.nextLine();
        System.out.print("How many hours did you work per a week? ");
        hours = keyboard.nextInt();
        System.out.print("How much do you get per an hour? ");
        payRate = keyboard.nextDouble();
        grossPay = hours * payRate;
        System.out.println("Hello "+name);
        System.out.println("Your gross pay is "+grossPay);

        //nextByte() 
        //nextDouble()
        //nextFloat()
        //nextInt()
        //nextLine()
        //nextLong()
        //nextShort()



    }
}
