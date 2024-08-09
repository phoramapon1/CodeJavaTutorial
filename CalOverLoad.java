public class CalOverLoad {
    public static void main(String[] args) {
        OverLoadDemo o1 = new OverLoadDemo();
        OverLoadDemo o2 = new OverLoadDemo(88);
        OverLoadDemo o3 = new OverLoadDemo(24.7);
        OverLoadDemo o4 = new OverLoadDemo(2, 4);

        System.out.println("o1.x : " +o1.x);
        System.out.println("o2.x : " +o2.x);
        System.out.println("o3.x : " +o3.x);
        System.out.println("o4.x : " +o4.x);

    }
}
