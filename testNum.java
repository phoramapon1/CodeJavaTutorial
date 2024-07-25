public class testNum {
    public static void main(String[] args){
        int K, P;
        K = 10;
        P = K+1;
        System.out.println("K = " +K+ " P= " +P);
        P = P++ ;
        System.out.println("K = " +K+ " P= " +P);
        P = P++ ; //ถ้าใช้จริงตัวพีต้องสลับมาหลังบวกเเบบนี้ ++P
        System.out.println("K = " +K+ " P= " +P);
    }
}
