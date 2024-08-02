public class TestOver1 {
    public static int add() {
        return 0;
    }
    public static int add(int x){
        return x;
    }
    public static int add(int x, int y) {
        return x + y;
    }
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static void main(String[] args) {
        System.out.println("sum " +add());
        System.out.println("sum " +add(3));
        System.out.println("sum " +add(2,2));
        System.out.println("sum " +add(2,2,2));
    }
}
