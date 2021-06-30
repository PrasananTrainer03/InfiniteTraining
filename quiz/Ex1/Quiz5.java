public class Quiz5 {
    public static void main(String[] args) {
        test(101.9F); 
    }

    public static void test(Object ob) {
        System.out.println("Object " +ob);
    }    

    public static void test(double ob) {
        System.out.println("double " +ob);
    }
}