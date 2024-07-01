class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        int ms = Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<nums.length;i++){
            cs = cs + nums[i];
            if(cs>ms)
            {
                ms = cs;
            }
            if(cs<0)
            {
                cs = 0;
            }
            
        }
        return ms;
    }
}