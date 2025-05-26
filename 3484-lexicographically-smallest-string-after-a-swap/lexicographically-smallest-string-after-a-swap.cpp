class Solution {
public:
    string getSmallestString(string s) {
         for (int i = 1; i < s.length(); ++i) {
        // Check if both characters have the same ASCII parity (odd or even)
        if ((s[i - 1] % 2 == s[i] % 2) && (s[i - 1] > s[i])) {
            swap(s[i - 1], s[i]);  // Perform swap
            break;                 // Only one swap allowed
        }
    }
     return s;
    }
};