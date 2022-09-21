class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> ans = new HashSet();
        
        for(int i = 0; i < jewels.length(); i++){
            if(!ans.contains(jewels.charAt(i))){
                ans.add(jewels.charAt(i));
            }
        }
        int total = 0;
        for(int i = 0; i < stones.length(); i++){
            if(ans.contains(stones.charAt(i))){
                total++;
            }
        }
        return total;
    }
}