class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int sum1=l;
        int sum2=0;
        for(int i=0;i<l;i++)
        {
            sum1=sum1+i;
            sum2=sum2+nums[i];
        }
        return (sum1-sum2);
        
    }
}