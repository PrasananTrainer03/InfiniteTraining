class C1 {
    private C1() {
        System.out.println("C1");
    }
}

class C2 extends C1 {
    public C2() {
        System.out.println("C2");
    }
}
public class P50 {
    public static void main(String[] args) {
        new C2();
    }
}