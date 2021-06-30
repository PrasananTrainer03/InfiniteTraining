public class Prog7 {
    public static void main(String[] args) {
        byte b1 = 10; 
        byte b2 = +5; 
        b1 = b2;  // Ok. byte to byte assignment 
        System.out.println(b1);
        System.out.println(b2);
    }       
}