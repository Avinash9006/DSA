class MazeProblem {

    public static void main(String[] args) {
        int[][] maze = { { 1, 1, 1 }, { 1, 0, 0 }, { 1, 1, 1 } };
        // System.out.println(countPaths(maze, 3, 3));
        printPaths(maze, 3, 3, "");
        System.out.println();
        printPathsWithObstacles(maze, 3, 3, "");

    }

    static int countPaths(int[][] maze, int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        return countPaths(maze, x - 1, y) + countPaths(maze, x, y - 1);
    }

    static void printPaths(int[][] maze, int x, int y, String path) {
        if (x == 1 && y == 1) {
            System.out.print(path + " ");
            return;
        }
        if (x - 1 > 0)
            printPaths(maze, x - 1, y, "R" + path);
        if (y - 1 > 0)
            printPaths(maze, x, y - 1, "C" + path);
        // if diagonal also needed
        // if (x - 1 > 0 && y - 1 > 0) {
        // printPaths(maze, x - 1, y - 1, "D" + path);
        // }

    }

    // if there is any obstacles
    static void printPathsWithObstacles(int[][] maze, int x, int y, String path) {
        if (maze[2][2] == 0) {
            System.out.println("No Path");
            return;
        }
        if (x == 1 && y == 1) {
            System.out.print(path + " ");
            return;
        }
        boolean found = false;
        if (x - 1 > 0 && maze[x - 2][y - 1] == 1) {
            found = true;
            printPathsWithObstacles(maze, x - 1, y, "R" + path);
        }
        if (y - 1 > 0 && maze[x - 1][y - 2] == 1) {
            found = true;
            printPathsWithObstacles(maze, x, y - 1, "D" + path);
        }
        if (!found) {
            System.out.println("No Path");
        }

    }

}
