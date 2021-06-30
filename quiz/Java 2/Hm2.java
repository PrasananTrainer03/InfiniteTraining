import java.util.HashMap;

public class Hm2 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(123, "Hi");
        hm.put(234, "Demo");
        hm.put(333, "Test");
        hm.put(123, "Java");
        String x =(String)hm.getOrDefault(444, "Not found");
        System.out.println(x);
    }
}