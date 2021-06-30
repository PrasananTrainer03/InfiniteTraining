public class Tc3 {
    public static void main(String[] args) {
        double d = 100.04;
        long l = (long)d;  //explicit type casting required
        int i = (int)l;	//explicit type casting required 
        byte b =(byte)d;
        //long p =d;
        long p =(long)d;
  
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i);
        System.out.println("Int value "+b);
    }
}