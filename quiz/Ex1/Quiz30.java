class Employ {

}
class Customer {

}
public class Quiz30 {
    public void check(Object ob) {
        if (ob instanceof Employ) {
            System.out.println("Its Employ Class Object");
        } else if (ob instanceof Customer) {
            System.out.println("Its Customer Class Object");
        } else {
            System.out.println("its invalid Class object...");
        }
    }
    public static void main(String[] args) {
       new Quiz30().check(new Prog1());
    }
}