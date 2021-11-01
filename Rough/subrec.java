import java.util.ArrayList;

public class subrec {

    public static void main(String[] args) {
        // int[] coins = {1,2,5 };
        // System.out.println(remove("abcccad", 'c',0));
        // allSubset("abc", "");
        // System.out.println(allSubsetl1("abc", ""));
        // possibleSumInDice(4, "");
        // ArrayList<String> allSubset  = possibleSum(4, "", coins);
        // System.out.println(allSubset.size());
        letterCombinations("345","");

    }
    // Google Permutations Question dialpad
    static void letterCombinations(String string, String string2) {
        if(string.length()==0){
            System.out.print(string2 + " ");
            return;
        }
        int c = (Character.getNumericValue(string.charAt(0))-1)*3;
        letterCombinations(string.substring(1),string2+((char)('a'+ c )));
        letterCombinations(string.substring(1),string2+((char)('a'+ c+1 )));
        letterCombinations(string.substring(1),string2+((char)('a'+ c+2 )));
    }
    //DICE Problem
    public static ArrayList<String> possibleSumInDice(int sum, String string) {
        if (sum == 0) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(string);
            System.out.println(string);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= sum && i <= 6; i++) {
            String tobeadded = sum - i != 0 ? string + i + " + " : string + i;
            list.addAll(possibleSumInDice(sum - i, tobeadded));
        }
        return list;
    }
    
    
    //Coin Problem
    public static ArrayList<String> possibleSum(int sum, String string, int[] coins) {
        if (sum == 0) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(string);
            System.out.println(string);
            return list;
        }
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= sum) {
                String tobeadded = sum - coins[i] != 0 ? string + coins[i] + " + " : string + coins[i];
                list.addAll(possibleSum(sum - coins[i], tobeadded, coins));
            }
        }
        return list;
    }

    // abcccad -> bcccd remove from string
    static String remove(String s, char c, int i) {
        if (i == s.length()) {
            return "";
        }
        return s.charAt(i) != c ? s.charAt(i) + remove(s, c, i + 1) : remove(s, c, i + 1);
    }

    // print all subset
    static void allSubset(String str, String up) {
        if (str.length() == 0) {
            System.out.println(up);
            return;
        }
        char c = str.charAt(0);
        allSubset(str.substring(1), up + c);
        allSubset(str.substring(1), up);
    }

    // store it in arraylist and return
    static ArrayList<String> allSubsetl1(String str, String res) {
        if (str.length() == 0) {
            ArrayList<String> a1 = new ArrayList<String>();
            if (res.length() != 0)
                a1.add(res);
            return a1;
        }
        char c = str.charAt(0);
        ArrayList<String> a2 = allSubsetl1(str.substring(1), res + c);
        ArrayList<String> a3 = allSubsetl1(str.substring(1), res);
        a2.addAll(a3);
        return a2;
    }

}
