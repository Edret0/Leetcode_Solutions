class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n*2];
        int left = 0;
        int right = n;
        int pos = 0;
        while(right < nums.length){
            ans[pos] = nums[left];
            pos++;
            ans[pos] = nums[right];
            left++;
            right++;
            pos++;
        }
        return ans;
    }
}