public class LibraryCard {
    private Student1 owner;
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBook){
        borrowcnt = borrowcnt + numOfBook;
    }
    public void setOwnerName(Student1 student){
         owner = student;
    }
    public int getNumberOfBook(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return "Owner Name : " +owner.getName() + "\n" + "Email : " 
        +owner.getEmail() +"\n" +"Book Borrowed" +borrowcnt;
    }
}
