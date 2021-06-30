public class P54 {
    public static void show() {
        throw new NullPointerException("Hello");
    }
    public static void main(String[] args) {
        try {
            show();
        }
    catch(Exception e) {
        System.out.println(e.getMessage());
        System.out.println("B");
    }
    }
}