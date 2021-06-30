public class Prog3 {
    public static void main(String[] args) {
        long big = 555L; 
    float f = 1.19F; 
    int i = 15; 
    //i = big; // A compile-time error. long to int, assignment incompatible 
    //i = f;   // A compile-time error. float to int, assignment incompatible 
    i = (int)big; // Ok
    System.out.println(i);
    i = (int)f;   // Ok 
    System.out.println(i);
    }
}