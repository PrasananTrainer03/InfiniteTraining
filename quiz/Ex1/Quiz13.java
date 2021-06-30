public class Prog17 {
    public static void main(String[] args) {
        test(101); 
        test(new Integer(101));
    
      }
    
    //   public static void test(Integer iObject) {
    //     System.out.println("Integer=" + iObject);
    //   }
     public static void test(Object iObject) {
        System.out.println("Object =" + iObject);
      }
    
      public static void test(int iValue) {
        System.out.println("int=" + iValue);
      }
}