public class P23 {
    public static void main(String[] args) {
        int[] a=new int[5];
        try {
            a[6]=5/0;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Size Small...");
        } catch(ArithmeticException e) {
            System.out.println("Division By Zero Impossible");
        } catch(Exception e) {
            System.out.println("General Exception");
        }
    }
}