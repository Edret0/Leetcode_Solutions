class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int end = s.length()-1;
        int count = 0;
        while(end >= 0){
            if(Character.isWhitespace(s.charAt(end))){break;}
            else{
                end--;
                count++;
                }
        }
        return count;
    }
}