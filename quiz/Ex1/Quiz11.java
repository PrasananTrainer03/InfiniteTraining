public class Quiz11 {
    static int x;
    public void incr() {
        ++x;
        System.out.println(x);
    }
    public static void main(String[] args) {
        Quiz11 obj1 = new Quiz11();
        Quiz11 obj2 = new Quiz11();
        Quiz11 obj3 = new Quiz11();
        obj1.incr();
        obj2.incr();
        obj3.incr();
    
    }
}

