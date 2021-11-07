import java.io.*;
import java.util.*;


public class Amazon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            long N = Long.parseLong(br.readLine().trim());

            long out_ = solve(N);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static long solve(long N){
        long result = 0;
        int l = (int)Math.log10(N)+1;
        long[] arr = new long[l];
        int j = 0;
        while(N > 0){
            arr[j] = N%10;
            N = N/10;
            j++;
        }
        Arrays.sort(arr);
        long s1 = arr[0];
        long s2 = arr[1];
        for(int i=2;i<arr.length;i++){
           if((i&1)==0)
           s1 = s1*10 +arr[i];
           else s2 =  s2*10 + arr[i];
        }
        result = s1 + s2;
        return result;
    
    }
}