import java.io.*;
import java.util.Arrays;

public class Amazon2nd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for (int i_A = 0; i_A < arr_A.length; i_A++) {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int K = Integer.parseInt(br.readLine().trim());

            int out_ = minOperations(N, A, K);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static int minOperations(int N, int[] A, int K) {
        int result = 0;
        int total = N % K == 0 ? (N / K) - 1 : (N / K);
        for (int i = 1; i <= K; i++) {
            for (int j = 1; j < total; j++) {
                int current = A[j * K + (i - 1)];
                int previous = A[(j - 1) * K + (i - 1)];
                int olderprevious = (j - 2) * K + (i - 1) >= 0 ? A[(j - 2) * K + (i - 1)] : -1;
                if (j * K + (i - 1) < N && previous > current) {
                    A[(j - 1) * K + (i - 1)] = olderprevious;
                    if (current < olderprevious && olderprevious != -1) {
                        A[j * K + (i - 1)] = olderprevious;
                        result++;
                    }
                    result++;
                }
            }
        }
        return result;

    }
}