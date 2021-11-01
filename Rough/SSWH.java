import java.util.Scanner;

class SSWH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n, t, gd, count = 0, tillmax;
        t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String line = sc.nextLine();
            n = Integer.parseInt(line.split(" ")[0]);
            k = Integer.parseInt(line.split(" ")[1]);
            int g[] = new int[n];
            int h[] = new int[n];
            line = sc.nextLine();
            for (i = 0; i < n; i++) {
                h[i] = Integer.parseInt(line.split(" ")[i]);
            }
            line = sc.nextLine();
            for (i = 0; i < n; i++) {
                g[i] = Integer.parseInt(line.split(" ")[i]);
            }
            for (i = 0; i < n; i++) {
                gd = 0;
                tillmax = 0;
                for (j = i; j < n; j++) {
                    if (tillmax <= h[j]) {
                        tillmax = h[j];
                        gd = gd + g[j];
                        if (gd >= k) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            t = t - 1;
        }
        sc.close();
    }
}
