class Solution {
    public int differenceOfSum(int[] nums) {
        int digit_sum=0;
        int element_sum=0;
        
        for(int i=0;i<nums.length;i++){
            for(int j=nums[i];j>0;j/=10){
                int last_digit=j%10;
                digit_sum += last_digit;
            }
            element_sum += nums[i];
        }

        int ans=Math.abs(element_sum-digit_sum);
        return ans;
    }
}