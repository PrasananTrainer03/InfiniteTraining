public class Prog11 {
    public static void main(String[] args) {
        int i = 15; 
    int j = 16; 
    i--; 
    System.out.println(i);
    --i; 
    System.out.println(i);
    i = 10; 
    i = i--;       // Assigns 10 to i
    System.out.println("Res " +i);
    i = 10; 
    j = i-- + 10;  
    System.out.println(j);
    i = 10; 
    j = --i + 10; 
    System.out.println(j);
    }
}