public class P52 {
    public static void main(String[] args) {
        throw new NullPointerException("Hello");
    }
    catch(ArithmeticException e) {
        System.out.println("B");
    }
}