public class Prog8 {
    public static void main(String[] args) {
        byte b1 = 10; 
        byte b2 = +5; 
        // b1 = +b2; // A compile-time error. 
  
        //To fix the error, add casting.

        b1 = (byte) +b2; // Ok 
        System.out.println(b1);
    }   
}