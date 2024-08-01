public class ExNo2 {
    public static void main(String[] args) {
        int Number = 100;

        System.out.println("Numbers less than " + Number + " can divisible by 3 and 5:");

        for (int i = 1; i <= Number; i++) {
           if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println(); 
    }
}
        
        

            
