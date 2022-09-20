class Solution {
    public boolean isAnagram(String s, String t) {
        int alphabets[] = new int[26];
        if(s.length() != t.length()){return false;}
        
        for(int i = 0; i < s.length(); i++){
            // subtract the character by a to get the index and then 
            // increment for string s and decrement for string t
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < alphabets.length; i++){
            if(alphabets[i] != 0){return false;}
        }
        return true;
    }
}