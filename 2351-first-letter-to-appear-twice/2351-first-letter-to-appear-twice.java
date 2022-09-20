class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> ans = new HashSet();
        
        for(int i = 0; i < s.length(); i++){
            if(ans.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                ans.add(s.charAt(i));
            }
        }
        return 's';
    }
}