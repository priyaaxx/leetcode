class Solution {
    public String[] findRelativeRanks(int[] score) {
     int n = score.length;
        int[][] pair = new int[score.length][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = score[i];
            pair[i][1] = i;
        }
        
        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));
        
        String[] result = new String[score.length];
        result[pair[0][1]] = "Gold Medal";
        if(n>=2)
            result[pair[1][1]] = "Silver Medal";
        if(n>=3)
            result[pair[2][1]] = "Bronze Medal";
        for (int i = 3; i < score.length; i++) {
            result[pair[i][1]] = Integer.toString(i+1);
        }
        return result;   
    }
}