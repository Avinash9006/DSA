import java.util.Arrays;

public class Rec3 {

    public static void main(String[] args) {
        int arr[] = { 3, 4, 1, 17, 2, 9, 0 };
        // patter(7,0);
        bsort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        // patterwithoutrec(7);
    }

    static void patterwithoutrec(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bsort(int[] arr, int i, int j) {
        if (i < 0) {
            return;
            
        }
        if ((j + 1) != i + 1 && arr[j] > arr[j + 1]) {
            swap(arr, j, j + 1);
            bsort(arr, i, j + 1);
        } else if ((j + 1) != i + 1) {
            bsort(arr, i, j + 1);
        }
        if (i == j) {
            bsort(arr, i - 1, 0);
        }
    }

    public static void patter(int x, int y) {
        if (x == 0) {
            return;
        }
        if (y < x) {
            System.out.print("* ");
            patter(x, y + 1);
        } else {
            System.out.println();
            patter(x - 1, 0);
        }

    }

}
