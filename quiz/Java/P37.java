class C1 {
    public int x=1;
    C1() {
        System.out.println("jhg");
    }
}

class C2 extends C1 {
    int x;
    public C2(int x) {
       this.x=x;
    }
}
public class P37 {
    public static void main(String[] args) {
        C2 obj = new C2(10);
        System.out.println(obj.x);
    }
}