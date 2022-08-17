class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> duplicate_hashmap = new HashMap();
        for(int i = 0; i < nums.length; i++){
            if(duplicate_hashmap.containsKey(nums[i])){
                return true;
            }
            else{
                duplicate_hashmap.put(nums[i],i);
            }
        }
        return false;
        
    }
}