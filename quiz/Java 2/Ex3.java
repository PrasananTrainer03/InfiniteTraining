class MyException extends Exception {
    int detail;
    MyException(int x) {
        detail=x;
    }
    @Override 
    public final String toString() {
        return "" +detail;
    }
}

public class Ex3 {
    static void compute(int x) throws MyException {
        throw new MyException(x);
    }
    public static void main(String[] args) {
        try {
            compute(12);
        // } catch(MyException e) {
        //     System.out.println("Custom");
        } catch(Exception e) {
            System.out.println("Exception");
        }
    }
}