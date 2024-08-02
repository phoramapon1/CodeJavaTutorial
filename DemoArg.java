public class DemoArg {
    public static void main(String[] args) {
        System.out.println("start in main");
        int tesetNum = 10;
        int Total;
        displayValue(5);
        displayValue(tesetNum);
        displayValue(tesetNum *5);
        Total = showSum(3, 4);
        System.out.println("total have value : " + Total);

    }
    public static void displayValue(int num) {
        System.out.println("value is "+num);
    }
    public static int showSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }
}
