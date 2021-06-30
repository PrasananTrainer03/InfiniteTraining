public class Prog23 {
    public static void main(String[] args) {
      try { 
        m1();
      } catch (MyException e) {
        e.printStackTrace(); // Print the stack trace
      }
    }
  
    public static void m1() throws MyException {
      m2();
    }
  
    public static void m2() throws MyException {
      // throw new MyException("Some error has occurred.");
      throw new MyException();
    }
  }
  
  class MyException extends Exception {
  
    public MyException() {
      super();
    }
  
    public MyException(String message) {
      super(message);
    }
  
    public MyException(String message, Throwable cause) {
      super(message, cause);
    }
  
    public MyException(Throwable cause) {
      super(cause);
    }
  }