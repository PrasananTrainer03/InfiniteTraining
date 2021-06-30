class Foo {
    public int a = 3; 
    public void addFive() { 
    a += 5; System.out.print("f "); 
    } 
    } 
    
    class Bar extends Foo {
    public int a = 8; 
    public void addFive() { 
    this.a += 5; System.out.print("b " ); 
    } }

     class p1 {
    public static void main(String[] args) {
        Bar f = new Bar(); 
        f.addFive(); 
        System.out.println(f.a);      
    }
    }
