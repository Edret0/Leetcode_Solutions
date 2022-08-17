class Solution {
    public int[] runningSum(int[] nums) {
        int [] answer = new int[nums.length];
        int running_sum = nums[0];
        answer[0] = running_sum;
        for(int i = 1; i<nums.length;i++){
            running_sum += nums[i];
            answer[i] = running_sum; 
        }
        return answer;
        
        
    }
}