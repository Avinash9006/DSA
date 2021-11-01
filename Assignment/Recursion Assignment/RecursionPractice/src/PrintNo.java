/*
 * Print numbers from 1 to N without the help of loops.
 * 
 * Input: N = 10
 * Output: 1 2 3 4 5 6 7 8 9 10
 */
class PrintNo {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        System.out.print(n + " ");
    }
}