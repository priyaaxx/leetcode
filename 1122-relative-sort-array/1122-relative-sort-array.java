class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       ArrayList<Integer> ans = new ArrayList<>();
        int answer [] = new int[arr1.length];
       Arrays.sort(arr1);
       for(int i=0;i<arr2.length;i++)
       {
           for(int j=0;j<arr1.length;j++)
           {
               if(arr2[i] == arr1[j])
               {
                   ans.add(arr1[j]);
                   arr1[j] = -1;
               }
           }
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=-1)
            {
                ans.add(arr1[i]);
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}