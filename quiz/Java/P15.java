public class P15 {
    public static void main(String[] args) {
        try {
            int x=5/0;
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(Exception e) {
            System.out.println("Global Exception");
        }

    }
}