class First {
    public void show(int x) {
        System.out.println("Hello " +x);
    }

    public int show(int x, int y) {
        return x+y;
    }
}

class Second extends First {
    // public int show(int x) {
    //     return x;
    // }
    public int show(int x,int y, int z) {
        return x+y+z;
    }
}

public class Quiz8 {
    public static void main(String[] args) {
        new Second().show(12,77,567);
    }
}