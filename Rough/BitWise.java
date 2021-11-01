// import java.lang.*;
public class BitWise {

    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 5 };
        // System.out.println(checkeven(4));
        System.out.println(unique(a));
        // System.out.println(ithresetbit(5,1));
        // System.out.println(ithbit(5,5));
        System.out.println(magic(3));
    }

    /*
     * And 1. & with 1 give odd or even 2. & with with all 1 give same No Or XOR NOT
     * ~ compliment operator left shift 1. a<<1 means 2*a
     * 
     * right shift >> 1. a>>1 a/2
     * 
     * xor 1. a^a = 0 2. a^0 = a ex - > [1,2,1,2,3] xor all give the alone element
     * no
     * 
     * ith bit in a no
     */
    static boolean checkeven(int n) {
        return (n & 1) != 1;
    }

    static int unique(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a ^ arr[i];
        }
        return a;
    }

    // ith bit in a No
    /*  1 left shift n-1 , ith bit = 5
        n = 100010
        mask = 010000 (how to get this left shift 1 till n-1 times)
        and with n&mask is your answer
     */
    static int ithbit(int n, int i) {
        int mask = (1 << (i - 1));
        return (mask & n) == 0 ? 0 : 1;
    }

    // reset ith bit in a No
     /* same as above only mask  put 1 */
    static int ithresetbit(int n, int i) {
        int mask = ~(1 << (i - 1));
        return (mask & n);
    }

    /* N&-N gives most significant bit
     little confusion 

     to check no is power of 2 and or not 
     (N & N-1) 0 is exception
    */


    // magic No in
    static int magic(int n) {
        int s = 0,base=5;
        while (n > 0){
           int last  = (n & 1);
           n=n >> (1);
           s = s + last * base;
           base = base *5;
        }
        return s;

    }
}
