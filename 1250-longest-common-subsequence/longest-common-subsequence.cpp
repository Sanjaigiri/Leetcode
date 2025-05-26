class Solution {
public:
    int lcs(string&S1, string&S2, int i, int j, int n, int m, vector<vector<int>> &dp) {
        if (i >= n || j >= m)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        if (S1[i] == S2[j])
            return dp[i][j] = 1 + lcs(S1, S2, i + 1, j + 1, n, m, dp);
        else
            return dp[i][j] = max(
                lcs(S1, S2, i + 1, j, n, m, dp),
                lcs(S1, S2, i, j + 1, n, m, dp)
            );
    }

    int longestCommonSubsequence(string S1, string S2) {
        int n = S1.size();
        int m = S2.size();
        vector<vector<int>> dp(n, vector<int>(m, -1));  // Initialize dp table with -1
        return lcs(S1, S2, 0, 0, n, m, dp);
    }
};