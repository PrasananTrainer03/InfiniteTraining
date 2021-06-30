import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class P45 {
    public static void main(String[] args) throws ParseException {
        Date obj = new Date();
        System.out.println(obj);
        String str ="2019/02/23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = sdf.parse(str);
        System.out.println(d.getMonth());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
    }
}