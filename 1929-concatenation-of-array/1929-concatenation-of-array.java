class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[2*nums.length];
        boolean isDone = false;
        int start = 0;
        int ansIndex = 0;
        while(ansIndex != ans.length){
            if(start == nums.length){
                start = 0;
            }
            else{
                ans[ansIndex] = nums[start];
                start++;
                ansIndex++;
            }
        }
        return ans;
    }
}