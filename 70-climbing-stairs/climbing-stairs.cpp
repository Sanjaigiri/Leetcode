class Solution {
public:
    int climbStairs(int n) {
        int prev1=3;
        int prev2=2;
        int cur=0;
        if (n==0 || n==1 || n==2 || n==3) 
        {
            return n;
        }
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur; 
             
    }
};