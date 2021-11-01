import java.util.*;
public class Rec2 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 6, 7, 8, 7 };
        System.out.println(FindIndex(arr, 7));
    }

    static ArrayList<Integer> FindIndex(int arr[], int target) {
        return FindIndexhelper(arr, target, 0, new ArrayList<Integer>());
    }

    static ArrayList<Integer> FindIndexhelper(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index+1);
        }
        return FindIndexhelper(arr, target, index + 1, list);

    }

    static Boolean checkSorted(int arr[]) {
        return helpercheckSorted(arr, 0);
    }

    static Boolean helpercheckSorted(int arr[], int i) {
        if (i == arr.length - 1)
            return true;
        return arr[i] < arr[i + 1] && helpercheckSorted(arr, i + 1);
    }

    /// I have to rotated binary search
}
