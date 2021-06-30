class C1 {
    int a;
    public C1(int a) {
        this.a=a;
    }
}
class C2 extends C1 {
    int a;
    int b;
    public C2(int a) {
        super(a);
        this.a=12;
        this.b=5;
    }
    public C2(int a,int b) {
        super(a);
        this.b=b;
        System.out.println(a+""+b);
    }
}
public class P30 {
    public static void main(String[] args) {
        new C2(15,56);
    }
}