class Samsung {
    public static void main(String[] args) {
        int arr[] = { -20, 6, 2, 1, -10 };
        int ans = findMinPos(arr);
        System.out.println(ans);
    }

    public static int findMinPos(int arr[]) {
        int pos = 0, res = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int c = arr[i];
                arr[i] = arr[pos];
                arr[pos++] = c;
            }
        }
        res = res - pos + 1;
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] < (arr.length - pos) && arr[i] > 0)
                arr[arr[i] + pos-1] = -1 * arr[i];
        }
        for (int i = pos; i < arr.length; i++) {
            if (arr[i] >= 0){
                res = i + 1 - pos;
                break;
            }
        }
        return res;
    }
}