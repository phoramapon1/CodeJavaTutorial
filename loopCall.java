public class loopCall {
    public static void main(String[] args){
        System.out.println("Hello From the main method. ");
        for (int i = 1; i <= 5; i++){
            displaymessage();
        }
        System.out.println("Back in the main method");
    }
    public static void displaymessage() {
        System.out.println("Hello From the displaymessage");
    }
}
