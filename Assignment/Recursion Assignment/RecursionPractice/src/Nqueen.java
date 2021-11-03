class Nqueen {

    public static void main(String[] args) {
        int[][] board = new int[4][4];
        System.out.println(placeQueen(board, 0));
    }

    static int placeQueen(int[][] board, int N) {
        if (N == board.length) {
            print(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, N, i)) {
                board[N][i] = 1;
                count = count + placeQueen(board, N + 1);
                // backtracking
                board[N][i] = 0;
            }

        }
        return count;
    }

    static boolean isSafe(int[][] board, int ith, int jth) {
        int min = Math.min(ith, jth);
        int maxR = Math.min(ith, (board.length) - jth - 1);
        // column check
        for (int i = ith; i > 0; i--) {
            if (board[i - 1][jth] == 1) {
                return false;
            }
        }
        // Diagonal Left Check
        for (int i = 0; i < min; i++) {
            if (board[ith - 1][jth - 1] == 1) {
                return false;
            }
        }
        for (int i = 0; i < maxR; i++) {
            if (board[ith - 1][jth + 1] == 1) {
                return false;
            }
        }
        return true;
    }

    static void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1)
                    System.out.print("Q ");
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();

        }
    }

}
