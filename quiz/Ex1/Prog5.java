public class Prog5 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i = 10; 
       // An error. 
        // b1 = i + 5;
        b1 = (byte)(i + 5);
        System.out.println(b1); // OK 
        b1 = (byte)(i + 256);
        System.out.println(b1);
        // f1 is promoted to double and f1 + d1 is of the data type double

        // float f1 = 2.5F; 
        // double d1 = 20.0; 
        // f1 = f1 + d1; //An error.
        //i is promoted to float and i + f1 is of the data type float

    }
}