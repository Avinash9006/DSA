/*
 * Q-> Given an array of integers, print a sum triangle from it such that the
 * first level has all array elements. From then, at each level number of
 * elements is one less than the previous level and elements at the level is be
 * the Sum of consecutive two elements in the previous level.
 * 
 * Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28] 
         [8, 12, 16] 
         [3, 5, 7, 9] 
         [1, 2, 3, 4, 5] 

Explanation :
Here,   [48]
        [20, 28] -->(20 + 28 = 48)
        [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
        [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
        [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9) 
 */
class TriangleSum {
        static public void main(String[] args) {
                int[] arr = { 1, 2, 3, 4, 5 };
                printTriangleSum(arr);
        }

        static void printTriangleSum(int[] arr) {
                if (arr.length == 1) {
                        print(arr);
                        return;
                }
                int a[] = new int[arr.length - 1];
                for (int i = 0; i < arr.length - 1; i++) {
                        a[i] = arr[i] + arr[i + 1];
                }
                printTriangleSum(a);
                print(arr);
        }

        static void print(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
                System.out.println();
        }
}