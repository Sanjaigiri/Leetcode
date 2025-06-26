class Solution {
    public int maximumCount(int[] nums) {
        int negativecount=0;
        int postivecount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0){
                postivecount++;
            }
            else if(nums[i] < 0){

                negativecount++;
            }
        } 
        return Math.max(postivecount, negativecount);
           
    }
}