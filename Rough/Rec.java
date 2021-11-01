class Rec {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 3;
        int ele = searchElements(arr, target, 0, (arr.length - 1));
        System.out.println(ele + 1);
    }

    // Tail Recursion
    public static int searchElements(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return searchElements(arr, target, mid + 1, end);
        }
        return searchElements(arr, target, start, mid - 1);

    }

}
