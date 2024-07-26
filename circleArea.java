import java.util.Scanner;
public class circleArea {
    public static void main(String[] args){
        double radius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your redius : ");
        radius = in.nextDouble();
        if ( radius < 0)
            System.out.println("Error : Redius must be >= 0 ");
            else{
                double area = 3.141 *  radius *  radius;
                System.out.println("the area is "+area);
            }
    }
}
