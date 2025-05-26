class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i = 0, j = 0;
        int lenS = s.length(), lenT = t.length();

        while (i < lenT && j < lenS) {
            if (s[j] == t[i])
                j++;
            i++;
        }

        return j == lenS; 
    }
};
