import java.util.Scanner;

public class Ex5_1 {

    private double base;
    private double height;

    
    public Ex5_1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("please input the width: ");
        double base = scanner.nextDouble();
        System.out.print("please input the height: ");
        double height = scanner.nextDouble();

       
        Ex5_1 triangle = new Ex5_1(base, height);

        
        double area = triangle.calculateArea();
        System.out.println("The area of the triangle is: " + area);
        
        scanner.close();
    }
}
