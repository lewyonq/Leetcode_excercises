/*
You are given an m x n binary matrix grid. An island is a group of 1's (representing land)
connected 4-directionally (horizontal or vertical.)
You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value 1 in the island.

Return the maximum area of an island in grid. If there is no island, return 0.
 */

public class MaxAreaOfIsland695 {


    public static void main(String[] args) {
        int[][] testArea = {{0,0,1,0,0,0,0,1,0,0,0,0,0}, {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0}, {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0}, {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0}, {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(testArea));
    }

    static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    int area = calculateArea(grid, i, j, visited);
                    if(area > maxArea) maxArea = area;
                }
            }
        }

        return maxArea;
    }

    static int calculateArea(int[][] grid, int x, int y, boolean[][] visited) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length
                || grid[x][y] == 0 || visited[x][y]) {
            return 0;
        }

        visited[x][y] = true;
        return (1 + calculateArea(grid, x - 1, y, visited)
                + calculateArea(grid, x + 1, y, visited)
                + calculateArea(grid, x, y - 1, visited)
                + calculateArea(grid, x, y + 1, visited));
    }
}