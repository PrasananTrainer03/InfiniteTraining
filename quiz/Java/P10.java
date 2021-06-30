class P10{
   int age;
   String name;
  //This is a Static Method
   static void disp(){
      System.out.println("Age is: "+age);
      System.out.println("Name is: "+name);
  }
  // This is also a static method
  public static void main(String args[]) 
  {
	  age = 30;
	  name = "Steve";
      disp();
  }
}