public class Prog6 {
    public static void main(String[] args) {
        float f1 = 2.5F; 
        int i = 10; 
        f1 = i + f1; // Ok. 
        System.out.println(i);
        //i is promoted to double and i + d1 is of data type double. double to float assignment is not permitted

        double d1 = 20.0; 
        int i = 10; 
        float f1 = 2.5F; 
        f1 = i + d1; // An error.

    //     f1 = (float)(i + d1); // OK 
    
    //     // 2.0 and 3.2 are of the type double. The result of 2.0 + 3.2 is 5.2, which is of the type double. double to float assignment is not permitted.

        float f1 = 2.5F; 
        f1 = 2.0 + 3.2; //An error. 
        // 2.0F and 3.2F are of the type float. The result of 2.0F + 3.2F, which is 5.2F, is of the type float.

        float f1 = 2.5F; 
        f1 = 2.0F + 3.2-
        // j is promoted to float and f1 + j is of the data type float. float to double assignment is permitted.

    //     int i = 10; 
    //     float f1 = 2.5F; 
    //     double d1 = f1 + i;     // Ok.

    }
}