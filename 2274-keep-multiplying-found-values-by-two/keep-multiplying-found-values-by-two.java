class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int a=0;a<nums.length;a++)
        {
           if(nums[a] == original)
            original=original*2;
        }  
        return original; 
         }
}