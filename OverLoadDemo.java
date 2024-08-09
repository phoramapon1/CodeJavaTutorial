public class OverLoadDemo {
    int x;
    OverLoadDemo(){
        System.out.println("Insedde OverLoadDemo(). ");
        x = 0;
    }
    OverLoadDemo(int i ){
        System.out.println("Insedde OverLoadDemo(int). ");
        x = i;
    }
    OverLoadDemo(double d ){
        System.out.println("Insedde OverLoadDemo(double). ");
        x = (int)d;
    }
    OverLoadDemo(int i, int j ){
        System.out.println("Insedde OverLoadDemo(int, int). ");
        x = i * j ;
    }
}
