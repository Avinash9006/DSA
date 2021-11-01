/*Complete the factorial function in the editor below. Be sure to use recursion. */

class Fact {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factorial(n - 1);

    }

}
