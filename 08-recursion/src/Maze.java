import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        mazePaths("", 3, 3);
//        System.out.println(mazePaths("", 3, 3, new ArrayList<>()));
        boolean[][] grid = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(mazePathsObs(grid, "", 0, 0, new ArrayList<>()));
        System.out.println(mazePathsAllDir(grid, "", 0, 0, new ArrayList<>()));
    }

    static void mazePaths(String p, int r, int c) {
        if (r < 1 || c < 1) {
            return;
        }
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        mazePaths(p + "D", r - 1, c);
        mazePaths(p + "R", r, c - 1);
    }

    static ArrayList<String> mazePaths(String p, int r, int c, ArrayList<String> list) {
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }
        if (r > 1) {
            mazePaths(p + "D", r - 1, c, list);
        }
        if (c > 1) {
            mazePaths(p + "R", r, c - 1, list);
        }
        return list;
    }

    static ArrayList<String> mazePathsObs(boolean[][] grid, String p, int r, int c, ArrayList<String> list) {
        if (r == grid.length - 1 && c == grid[0].length - 1) {
            list.add(p);
            return list;
        }
        if (!grid[r][c]) {
            return list;
        }
        if (r < grid.length - 1) {
            mazePathsObs(grid, p + "D", r + 1, c, list);
        }
        if (c < grid[0].length - 1) {
            mazePathsObs(grid, p + "R", r, c + 1, list);
        }
        return list;
    }

    static ArrayList<String> mazePathsAllDir(boolean[][] grid, String p, int r, int c, ArrayList<String> list) {
        if (r == grid.length - 1 && c == grid[0].length - 1) {
            list.add(p);
            return list;
        }
        if (!grid[r][c]) {
            return list;
        }
        grid[r][c] = false;
        if (r < grid.length - 1) {
            mazePathsAllDir(grid, p + "D", r + 1, c, list);
        }
        if (r > 0) {
            mazePathsAllDir(grid, p + "U", r - 1, c, list);
        }
        if (c < grid[0].length - 1) {
            mazePathsAllDir(grid, p + "R", r, c + 1, list);
        }
        if (c > 0) {
            mazePathsAllDir(grid, p + "L", r, c - 1, list);
        }
        grid[r][c] = true;
        return list;
    }
}
