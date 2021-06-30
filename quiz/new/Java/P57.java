import java.util.ArrayList;
public class P57 {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add("hi");
        obj.ensureCapacity(4);
        System.out.println(obj.size());
    }
}