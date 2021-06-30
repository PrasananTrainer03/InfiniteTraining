public class P16 {
    public static void main(String[] args) {
        try {
            System.out.println("B");
            throw new ArithmeticException();
         }
         // catch(ArithmeticException e) {
        //     System.out.println("A");
        // }
         catch(Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("Z");
        }
    }
}