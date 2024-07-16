class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                } else if(sum>0){
                    k--;
                } else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1])
                        j++;
                    while(j<k && nums[k] == nums[k+1])
                        k--;
                }
            }
        }
        return ans;
    }
}

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
        
//        //Optimal approach
       
//        List<List<Integer>> answer=new ArrayList<>();
        
//        int n=nums.length; 
//        Arrays.sort(nums);
        
//         for(int i=0 ; i<n ; i++)
//         {
//             if(i>0 && nums[i]==nums[i-1]) continue; //ignore rest directly move to for of i
            
//             int j=i+1;
//             int k=n-1;
            
//             while(j<k)
//             {
//                 int sum=nums[i]+nums[j]+nums[k];
//                 if(sum<0)
//                 {
//                     j++;
//                 }
//                 else if(sum>0)
//                 {
//                     k--;
//                 }
//                 else
//                 {
//                     //Sum is equal to 0
//                     List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
//                     answer.add(temp);
//                     j++;
//                     k--;
                    
//                     //To ignore same elements we'll move pointers j and k
//                     while(j<k && nums[j]==nums[j-1]) j++;
//                     while(j<k && nums[k]==nums[k+1]) k--;
//                 }
//             }
//         }
//         return answer;      
//     }
// }