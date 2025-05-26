class Solution {
public:
    string getSmallestString(string s) {
        string ans = s;
        for(int i = 0; i<s.size()-1; i++){
            int a = s[i]-'0';
            int b = s[i+1]-'0';

            if((a%2 == 0 && b%2 == 0) || (a%2 == 1 && b%2 == 1)){
                swap(s[i], s[i+1]);
                if(s <= ans){
                    ans = s;
                }
                swap(s[i], s[i+1]);
            }
        }
        return ans;
    }
};