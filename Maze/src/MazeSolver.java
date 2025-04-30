import java.util.*;

public class MazeSolver {
    int[][]directions={{0,1},{1,0},{0,-1},{-1,0}};//right down left and up
    public static void main(String[] args) {
        int[][] myMaze = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},//
                {2, 1, 1, 0, 1, 0, 0, 1, 1, 1},//
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},//
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},//
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},//
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},//
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},//
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//
        };
        MazeSolver solver = new MazeSolver();//defining the object so, I can call findPath without it being static
        List<int[]> path=solver.findPath(myMaze);//calling findPath method
        for(int[] pos: path){
            System.out.print("("+pos[0]+","+pos[1]+")");
        }
        System.out.println();


    }

    public List<int[]> findPath(int[][] maze){
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];//keeps track of visited cells
        List<int[]> path = new ArrayList<>();

        //Find start Position
        int startRow=-1, startCol=-1;
        for(int row = 0; row <rows; row++){
            for(int col=0; col<cols; col++){
                if(maze[row][col]==2){
                    startRow= row;
                    startCol=col;
                    break;
                }
            }
            if(startRow!=-1) break;
        }
        dfs(maze,startRow,startCol,path,visited);
        return path;
    }
    //Recursive Depth First Search
    private boolean dfs(int[][] maze, int row, int col, List<int[]> path,boolean[][] visited){
        //Check boundaries
        if(row<0||row>=maze.length||col<0||col>=maze[0].length||maze[row][col]==0 || visited[row][col]){
            return false;
        }
        path.add(new int[]{row,col});//adds current position to the path
        visited[row][col]=true;//marks the cell visited
        //Check if it is the end
        if(maze[row][col]==3){
            return true;
        }
        //Explore all directions
        for(int[] dir: directions){
            int newRow = row+dir[0];
            int newCol = col+dir[1];
            if(dfs(maze,newRow,newCol,path,visited)){
                return true;
            }
        }
        //back track if no path found
        path.remove(path.size()-1);
        return false;
    }

}
