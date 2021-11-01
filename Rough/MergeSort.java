import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1, 0 };
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        sort(arr, s, mid);
        sort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int l = 0, r = mid + 1, i = 0;
        int[] res = new int[right - left];

        for (i = 0; r < right && l < left; i++) {
            res[i] = arr[l] > arr[r] ? arr[r++] : arr[l++];
        }
        for (; l < left; i++) {
            res[i] = arr[l++];
        }
        for (; r < right; i++) {
            res[i] = arr[r++];
        }
        for (int j = left; j < right; j++) {
            arr[j] = res[j];
        }
    }

}
