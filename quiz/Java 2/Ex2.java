public class Ex2 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new NullPointerException();
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}