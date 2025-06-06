class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char C : columnTitle.toCharArray()) {
            result = result * 26 + (C - 'A' + 1);
           
        }
        return result;
    }
}