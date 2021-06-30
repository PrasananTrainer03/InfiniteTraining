class A {
    public int i,j;
    A() {
        i=1;
        j=2;
    }
}

class B extends A {
    B() {
    }
}
public class P58 {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.i + "  " +obj.j);
    }
}