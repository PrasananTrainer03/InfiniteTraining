public class Progv {
    public static void main(String[] args) {
        int x=12;
        Integer y =new Integer(12);
        System.out.println(y.hashCode());
        System.out.println(x++);
        System.out.println(y++);

        Integer z = Integer.valueOf(x);
        Integer p =(Integer)x;
        int p1=(int)p;
    }
}