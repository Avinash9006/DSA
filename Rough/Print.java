public class Print {

    public static void main(String[] args) {
        // printBoth(5);
        // reverse(582020,1);
        // System.out.println(reverse(3210, 0) + "");
        // System.out.println(reversewithoutrec(3210) + "");
        // System.out.println(Palindrome(1222));
        // System.out.println(countzero(32002,0));
        System.out.println(noOfSteps(14, 0));
    }

    static int noOfSteps(int n, int res) {
        if(n==0){
            return res;
        }
        return n%2!=0 ? noOfSteps(n-1, res+1) : noOfSteps(n/2, res+1);

    }

    static int countzero(int n, int res) {
        if (n == 0) {
            return res;
        }
        res = n % 10 == 0 ? res + 1 : res;
        return countzero(n / 10, res);
    }

    static int reversewithoutrec(int n) {
        int res = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            res = res * 10 + rem;
        }
        return res;

    }

    static int reverse(int n, int res) {
        if (n <= 0) {
            return res;
        }
        return reverse(n / 10, res * 10 + n % 10);
    }

    static Boolean Palindrome(int n) {
        return n == reverse(n, 0) ? true : false;
    }

    static int prod(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * prod(n / 10);
    }

    static void printBoth(int n) {
        if (n == 0 || n == 10)
            return;
        printBoth((n - 1));
        // printBoth((n - 1));
        System.out.print(n + " ");
        printBoth((n - 1));

    }

}
