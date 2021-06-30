class First {
    private int x=12;
    protected String name = "Welcome";
    public String company = "Company";
}
public class Quiz9 {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.x);
        System.out.println(obj.name);
        System.out.println(obj.company);
    }
}