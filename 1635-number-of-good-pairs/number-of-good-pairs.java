class Solution {
        public int numIdenticalPairs(int[] A) {
        int ans = 0;
        int [] c = new int[101];
        for (int a=0;a<A.length;a++) {
            ans += c[A[a]]++;
        }
        return ans;
        }
}
     