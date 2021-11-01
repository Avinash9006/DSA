import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = new char[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.next().charAt(0);
        }
        int mask = 1 << c.length;
        for (int m = 0; m < mask; m++) {
            for (int i = 0; i < c.length; i++) {
                int v = 1 << i;
                if ((m & v) != 0) {
                    System.out.print(c[i] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
