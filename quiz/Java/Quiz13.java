public class Quiz13 {
    public static void main(String[] args) {
        String s1 = "Hexaware";
        String s2 = new String("Hexaware");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = "Hexaware";
        System.out.println(s1==s3);
    }
}