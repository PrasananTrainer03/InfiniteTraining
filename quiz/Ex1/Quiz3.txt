public class Prog2 {
    public static void main(String[] args) {
        long b = 5;
    char c = 'a'; 
    short s = -2; 
    int i = 10; 
    i = b; // Ok. byte b is assignment compatible to int i 
    System.out.println(i);
    i = c; // Ok. char c is assignment compatible to int i
    System.out.println(i);
    i = s; // Ok. short s is assignment compatible to int i 
    System.out.println(i);
    } 
}