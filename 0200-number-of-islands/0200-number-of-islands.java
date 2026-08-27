class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        Queue<int[]> q = new LinkedList<>();

        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(grid[i][j] == '1') {

                    count++;

                    q.offer(new int[]{i, j});
                    grid[i][j] = '0';

                    while(!q.isEmpty()) {

                        int[] curr = q.poll();

                        int r = curr[0];
                        int c = curr[1];

                        for(int k = 0; k < 4; k++) {

                            int nr = r + dir[k][0];
                            int nc = c + dir[k][1];

                            if(nr >= 0 && nr < m &&
                               nc >= 0 && nc < n &&
                               grid[nr][nc] == '1') {

                                grid[nr][nc] = '0';
                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}