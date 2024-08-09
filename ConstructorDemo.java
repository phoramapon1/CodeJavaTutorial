public class ConstructorDemo {
    public static void main(String[] args) {
     ContRectangle boxA  = new ContRectangle(8.0,  12.0);
     ContRectangle boxB  = new ContRectangle();
    
    System.out.println("The box's Length is " +boxA.getlength());
    System.out.println("The box's Width is " +boxA.getwidth());
    System.out.println("The box's Area is " +boxA.getArea());

    System.out.println("The box's Length is " +boxB.getlength());
    System.out.println("The box's Width is " +boxB.getwidth());
    System.out.println("The box's Area is " +boxB.getArea());
   }
}   
   
    