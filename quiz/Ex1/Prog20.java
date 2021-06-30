import java.util.Map;
import java.util.HashMap;
public class Prog20 {
    public static void main(String[] args) {
        Map m = new HashMap(); 
        m.put(1, "Sanju");
        m.put(2, "Niki");
        m.put(3, "Nishtha");
        m.put(4, "Kolage");
        m.put(5, "Salve");
        m.put(6, "Babbar");
        // m.put(null, "Hi");

        String res = (String) m.getOrDefault(6, "Not Found");
        System.out.println(res);
    }
}