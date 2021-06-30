class Super {
    public static void tests() {
        System.out.println("Super Static");
    }
}

class Sub extends Super {
    public static void tests() {
        System.out.println("Sub Static");
    }
}
public class P55 {
    public static void main(String[] args) {
        Super s1 = new Sub();
        Sub s2 = new Sub();
        Super s3 = new Super();
        s1.tests();
        s2.tests();
        s3.tests();
    }
}