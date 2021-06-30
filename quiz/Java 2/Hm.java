import java.util.HashMap;

public class Hm {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(null,"Divya");
        hm.put(null, "Demo");
        hm.put(null, "Raj");
        hm.put(null,"Kalpana");
        String x =(String)hm.getOrDefault(2, "Not found");
        System.out.println(x);
    }
}