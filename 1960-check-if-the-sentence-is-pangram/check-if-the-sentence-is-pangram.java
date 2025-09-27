class Solution {
    public boolean checkIfPangram(String sentence) {
        String a = sentence.toLowerCase();
        for(char c='a';c<='z';c++){
            if(a.indexOf(c) == -1){
                return false;
            }

        }
        return true;



        }
}