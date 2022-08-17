
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> two_sum_hashmap = new HashMap();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(two_sum_hashmap.containsKey(complement)){
                return new int[]{two_sum_hashmap.get(complement) + 1,i+1};
            }
            else{
                two_sum_hashmap.put(nums[i],i);
            }
        }
        return new int[]{};
        
    }
}