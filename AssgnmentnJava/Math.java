import java.util.ArrayList;
import java.util.Arrays;

class Math {

    public static void main(String[] args) {
        
        // System.out.println(isPrime(3));
        // System.out.println(isPrime(5));
        // boolean[] test = rangePrimes(40);
        // System.out.println(test);
        // for (int i = 0; i < test.length; i++) {
        //     if (test[i])
        //         System.out.print(i + " ");
        // }
    }

    static boolean[] rangePrimes(int i) {
        boolean[] result = new boolean[i + 1];
        Arrays.fill(result, true);
        result[0] = false;
        result[1] = false;
        for (int j = 2; i >= j * j; j++) {
            if (result[j] == true && isPrime(j)) {
                for (int k = 2 * j; k < i; k = k + j) {
                    result[k] = false;
                }
            }
        }
        return result;
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; n >= (i * i); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
