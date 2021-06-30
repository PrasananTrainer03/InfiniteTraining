class Test1 {
    public Test1() {
        System.out.println("Base Class Constructor...");
    }
}

class Test2 extends Test1 {
    Test2() {
        System.out.println("Derived Class constructor...");
    }
}
public class Quiz5 {
    public static void main(String[] args) {
        new Test2();
    }
}