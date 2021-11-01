/* 
Write a function that reverses a string. The input string is given as an array of characters s.
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

 */

class ReverseString {

    public static void main(String[] args) {
        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        char[] s2 = { 'h', 'a', 'n', 'n', 'a', 'h' };
        reverse(s1);
        reverseUsingRec(s2);
        print(s1);
        print(s2);

    }

    static void print(char[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }

    static void reverseUsingRec(char[] s) {
        reverseUsingRecHelper(s, 0);
    }

    static void reverseUsingRecHelper(char[] s, int i) {
        if (i >= s.length / 2) {
            return;
        }
        swap(s, i, s.length - 1 - i);
        reverseUsingRecHelper(s, i + 1);
    }

    static void reverse(char[] s) {
        for (int i = 0; i < (s.length / 2); i++) {
            swap(s, i, s.length - i - 1);
        }
    }

    static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

}
