import java.util.HashSet;

public class P44 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Integer(12));
        hs.add(new Integer(12));
        hs.add(new Integer(12));
        hs.add(new Integer(12));
        for(Object ob : hs) {
            System.out.println(ob);
        }
    }
}