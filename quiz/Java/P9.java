public class P9 {
    static int count=0;
   public void increment()
   {
       count++;
   }
   public static void main(String args[])
   {
       P9 obj1=new P9();
       P9 obj2=new P9();
       P9 obj3=new P9();
       obj1.increment();
       obj2.increment();
       obj3.increment();
       
       System.out.println("Obj1: count is="+obj1.count);
              System.out.println("Obj2: count is="+obj2.count);
              System.out.println("Obj2: count is="+obj3.count);
   }
}