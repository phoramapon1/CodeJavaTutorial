import java.util.*;
public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("Input Data : ");
        x = in.nextInt();
        Bar(x);
    }
    public static void Bar(int data) {
        for (int x = 1; x <= data; x ++){
            System.out.println("*");
        }
        System.out.println();
    }
}
