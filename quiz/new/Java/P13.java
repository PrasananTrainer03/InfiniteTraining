enum Test {
    A, B, X, Y, P, C;
    private Test() {
        System.out.println("Hi");
    }
}

public class P13 {
    public static void main(String[] args) {
        Enum t = Test.Y;
    }
}