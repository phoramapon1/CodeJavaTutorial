public class TestDoWhile {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++){
            System.out.println("i in for "+i);
        }
        int iWhile = 0;
        while (iWhile <= 10) {
            System.out.println("iwhile in while"+iWhile);
            iWhile ++ ; 
        }
        int counter = 1;
        do{
            System.out.println("counter in dowhile : "+counter);
        }while(++counter <= 10);
    }
}

