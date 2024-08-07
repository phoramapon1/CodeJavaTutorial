public class Student {
    private String id;
    private String name;
    private double gpa;
    public void setDetails(String ID, String n, double GPA) {
        id = ID;
        name = n;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("GPA : " + gpa);
    }
    public static void main(String[] args) {
        Student sc1 = new Student();
        sc1.setDetails("12345", "Phoramapon", 3.50);
        sc1.showDetails();
        Student sc2 = new Student();
        sc2.setDetails("36654", "lisa", 3.90);
    }
}
