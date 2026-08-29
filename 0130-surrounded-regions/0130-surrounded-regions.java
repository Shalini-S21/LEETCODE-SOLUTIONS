class Solution {

    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        // First and last column
        for(int i = 0; i < m; i++) {

            if(board[i][0] == 'O')
                dfs(board, i, 0);

            if(board[i][n - 1] == 'O')
                dfs(board, i, n - 1);
        }

        // First and last row
        for(int j = 0; j < n; j++) {

            if(board[0][j] == 'O')
                dfs(board, 0, j);

            if(board[m - 1][j] == 'O')
                dfs(board, m - 1, j);
        }

        // Convert surrounded O to X
        // Restore safe O's
        for(int i = 0; i < m; i++) {

            for(int j = 0; j < n; j++) {

                if(board[i][j] == 'O')
                    board[i][j] = 'X';

                else if(board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int r, int c) {

        int m = board.length;
        int n = board[0].length;

        if(r < 0 || r >= m || c < 0 || c >= n)
            return;

        if(board[r][c] != 'O')
            return;

        // Mark as safe
        board[r][c] = '#';

        dfs(board, r - 1, c); // up
        dfs(board, r + 1, c); // down
        dfs(board, r, c - 1); // left
        dfs(board, r, c + 1); // right
    }
}