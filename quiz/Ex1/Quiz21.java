class First {
    public void show(int x) {
        System.out.println("Hello " +x);
    }
}

class Second extends First {
    public int show(int x) {
        return x+5;
    }
}

public class Quiz21 {
    public static void main(String[] args) {
        new Second().show(12);
    }
}