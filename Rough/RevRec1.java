import java.util.ArrayList;

public class RevRec1 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // int target = 5;
        // System.out.println("Search from Linear Search :" + linearSearch(arr, target,
        // 0));
        // System.out.println("Search from Binary Search :" + binarySearch(arr, target,
        // 0, arr.length - 1));
        // printSubSeq(arr, 0, "");
        // printSubSeqIterative(arr);
        printPermutation(arr, 0, "");
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, e);
        }
        return binarySearch(arr, target, s, mid - 1);
    }

    // This is how we are passing data from body , Not from arguments
    static ArrayList<Integer> linearSearch(int[] arr, int target, int i) {
        if (i > arr.length - 1) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (arr[i] == target) {
            result.add(i);
        }
        ArrayList<Integer> previous = linearSearch(arr, target, i + 1);
        result.addAll(previous);
        return result;
    }

    // permutation of the array list

    static void printSubSeq(int[] arr, int i, String curr) {
        if (arr.length - 1 < i) {
            System.out.println(curr);
            return;
        }
        printSubSeq(arr, i + 1, curr + arr[i]);
        printSubSeq(arr, i + 1, curr);
    }

    static void printSubSeqIterative(int[] arr) {
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
            int l = res.size();
            res.add(arr[i] + "");
            for (int j = 0; j < l; j++) {
                res.add(res.get(j) + arr[i]);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    static void printPermutation(int[] arr, int i, String str) {
        if (str.length() == arr.length) {
            System.out.println(str);
            return;
        }
        for (int j = 0; j < arr.length; j++) {
            printPermutation(arr, i + 1, str + arr[j]);
        }
    }

}
