/*
 * First uppercase letter in a string (Iterative and Recursive) Given a string
 * find its first uppercase letter Examples :
 * 
 * Input : geeksforgeeKs Output : K
 * 
 * Input : geekS Output : S
 * 
 */
class FirstCapital {

    public static void main(String[] args) {
        System.out.println(firstCap("geeksforgeeKs", 0));
        System.out.println(firstCap("geeksforgee", 0));
    }

    static Character firstCap(String string, int i) {
        if (string.length() == i)
            return null;
        char c = string.charAt(i);
        if ((int) c <= 90 && (int) c >= 65)
            return c;
        return firstCap(string, i + 1);
    }

}
