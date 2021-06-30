public class P7 {
  static int count=0;
    public P7() {
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        
        new P7();

        new P7();
        new P7();
    }
}