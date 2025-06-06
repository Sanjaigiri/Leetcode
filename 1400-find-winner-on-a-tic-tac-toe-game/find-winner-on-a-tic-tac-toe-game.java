class Solution {
    public String tictactoe(int[][] moves) {
        if (moves.length < 5)
            return "Pending";
        
        int[][] rows = new int[2][3];
        int[][] cols = new int[2][3];
        int[] diag = new int[2];
        int[] antiDiag = new int[2];

        for (int i = 0; i < moves.length; i++) {
            int player = i % 2;
            int x = moves[i][0], y = moves[i][1];

            rows[player][x]++;
            cols[player][y]++;
            if (x == y) diag[player]++;
            if (x + y == 2) antiDiag[player]++;

            if (rows[player][x] == 3 || cols[player][y] == 3 ||
                diag[player] == 3 || antiDiag[player] == 3)
                return player == 0 ? "A" : "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}