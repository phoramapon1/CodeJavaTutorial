public class StringMethods {
    public static void main(String[] args){
        String message = "Java is  Great fun";
        // 1. toUpercase() ตัวพิมพ์ใหญ่ทั้งหมด
        // 1. toLowercase() ตัวพิมพ์เล็กทั้งหมด
        //3. length() เก็บตัวเลข
        //4.chatAt(2) เก็ตัวอักษร
        
        String upper = message.toUpperCase();
        System.out.println(upper);
        
        String Lower = message.toLowerCase();
        System.out.println(Lower);
        
        int length = message.length();
        System.out.println(length);
        
        char alphabet = message.charAt(2);
        System.out.println(alphabet);
    }
}
