class PowerSet {

    public static void main(String[] args) {
        String str = "abc";
        // power(str);
        permuteRec(str,3,-1,"");
    }

    static void power(String str) {
        powerHelper(str, "");

    }

    static void powerHelper(String unpr, String pr) {
        if (unpr.length() == 0) {
            if (pr.length() != 0)
                System.out.print(pr + " ");
            return;
        }
        char c = unpr.charAt(0);
        powerHelper(unpr.substring(1), pr + c);
        powerHelper(unpr.substring(1), pr);

    }

    static void permuteRec(String str, int n,
                           int index, String curr)
    {
        // base case
        if (index == n) {
            return;
        }
        System.out.println(curr);
        for (int i = index + 1; i < n; i++) {
 
            curr += str.charAt(i);
            permuteRec(str, n, i, curr);
 
            // backtracking
            curr = curr.substring(0, curr.length() - 1);
        }
        return;
    }
 

}
