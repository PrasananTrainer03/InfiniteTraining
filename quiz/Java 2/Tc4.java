public class Tc4 {
    public static void main(String[] args) {
        int i = 100;
        byte ps =(byte)i;
        long l = i;	//no explicit type casting required
        float f = l;	//no explicit type casting required
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        double p =i;
        double f1 = f;
        System.out.println("P" +p);
    }
}