class Employee {
    private String name = "Unknown";
  
    public void setName(String name) {
      this.name = name;
    }//from ww w . j  a v a  2  s. com
  
    public String getName() {
      return name;
    }
  }
  
  class Manager extends Employee {
    public void giveOrder(){
      System.out.println("order");
    }
  }
  
  public class Prog25 {
    public static void main(String[] args) {
      Manager mgr = new Manager();
      Employee emp = mgr;
      if (emp instanceof Manager) {
         mgr = (Manager)emp;
         mgr.giveOrder();
      }
      else {
        // emp is not a Manager type
      }
    }
  }