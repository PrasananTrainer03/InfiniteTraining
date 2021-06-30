public class Prog10 {
    public static void main(String[] args) {
        int i = 1; 
    int j = 0; 
    j = i++ + 1;  
    System.out.println(j);
    System.out.println(i);
    
    i = 1; 
    j = 0;
    j = ++i + 1;   
    System.out.println();
    System.out.println(j);
    System.out.println(i);
    }
}