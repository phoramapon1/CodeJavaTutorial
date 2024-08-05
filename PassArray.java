import java.util.*;
public class PassArray {
    public static void main(String[] args) {
        final int array_size = 4;
        int [] numbers = new int[array_size];
        getValue(numbers);
        System.out.println("her are in the number that you entered");
        showArray(numbers);
    }
    private static void getValue(int[] array){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aseries of " +array.length+ "numbers.");
        for(int index = 0; index < array.length; index++){
            System.out.println("Enter numbers "+ (index+1)+ " ");
            array[index] = in.nextInt();

        }
    }
    public static void showArray(int[] array) {
        for (int index = 0; index<array.length; index++){
              System.out.println(array[index]+ " ");
        }
    }
}
