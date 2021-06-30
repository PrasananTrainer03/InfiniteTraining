public class Prog22_1 {
    static {
      try {throw new Exception("my exception");
      // System.out.println("2");
      }
      catch(Exception e){
        System.out.println("2");
      }
    }
 
    public static void main(String[] args){
      System.out.println("1");
    }
  }