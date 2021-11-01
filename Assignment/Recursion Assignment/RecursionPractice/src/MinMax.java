/*
Recursive Programs to find Minimum and Maximum elements of array

Given an array of integers arr, the task is to find the minimum and maximum element of that array using recursion.


Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: min = -5, max = 8

Input: arr = {1, 4, 45, 6, 10, -8};
Output: min = -8, max = 45
*/

class MinMax {

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, -5, -4, 8, 6 };
        int[] ans = findMinMax(arr);
        System.out.println("Min : " + ans[0] + " , Max: " + ans[1]);
        int[] arr1 = { 1, 4, 45, 6, 10, -8 };
        ans = findMinMax(arr1);
        System.out.println("Min : " + ans[0] + " , Max: " + ans[1]);
    }

    static int[] findMinMax(int[] arr) {
        int res[] = new int[2];
        findMinMaxHelper(arr, 0, res);
        return res;
    }

    static void findMinMaxHelper(int[] arr, int i, int[] res) {
        if (i == arr.length) {
            return;
        }
        if (i == 0) {
            res[0] = arr[i];
            res[1] = arr[i];
        }
        if (res[0] > arr[i]) {
            res[0] = arr[i];
        }
        if (res[1] < arr[i]) {
            res[1] = arr[i];
        }
        findMinMaxHelper(arr, i + 1, res);
    }

}
