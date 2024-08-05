public class BasicArray {
    public static void main(String[] args) {
        final int limit = 15, multiple = 10;
        int [] list = new int[limit];
        int sum = 0;
        for(int index = 0; index < limit; index++){
            list[index] = index * multiple;
        }
        list[5] = 999;
        for(int value : list){
            System.out.println(value+" ");
        }
        for (int value : list){
            sum += value;
        }
        System.out.println("Sum = : " +sum);
    }
}
