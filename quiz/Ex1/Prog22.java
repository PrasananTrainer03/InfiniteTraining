public class Prog22 {
    static {
      try {throw new ArithmeticException("my exception");
      // System.out.println("2");
      }
      // catch(ArithmeticException e) {
      //   System.out.println("3");
      // }
      catch(Exception e){
        System.out.println("2");
      }
    }
 
    public static void main(String[] args){
      System.out.println("1");
    }
  }