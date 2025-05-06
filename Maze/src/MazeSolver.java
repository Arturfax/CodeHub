import java.util.*;

public class MazeSolver {

    int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // right, down, left, up

    protected void runSolver() {
        int[][] myMaze = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {2, 1, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        List<int[]> path = findPath(myMaze);
        for (int[] pos : path) {
            System.out.print("(" + pos[0] + "," + pos[1] + ") ");
        }
        System.out.println();
    }

    public List<int[]> findPath(int[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        List<int[]> path = new ArrayList<>();

        int startRow = -1, startCol = -1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (maze[row][col] == 2) {
                    startRow = row;
                    startCol = col;
                    break;
                }
            }
            if (startRow != -1) break;
        }

        dfs(maze, startRow, startCol, path, visited);
        return path;
    }

    private boolean dfs(int[][] maze, int row, int col, List<int[]> path, boolean[][] visited) {
        if (row < 0 || row >= maze.length || col < 0 || col >= maze[0].length || maze[row][col] == 0 || visited[row][col]) {
            return false;
        }

        path.add(new int[]{row, col});
        visited[row][col] = true;

        if (maze[row][col] == 3) {
            return true;
        }

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (dfs(maze, newRow, newCol, path, visited)) {
                return true;
            }
        }

        path.remove(path.size() - 1); // backtrack
        return false;
    }
}
