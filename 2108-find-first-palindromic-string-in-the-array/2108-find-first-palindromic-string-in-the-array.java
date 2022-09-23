class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String s: words){
            StringBuilder temp = new StringBuilder();
            temp.append(s).reverse();
            if(s.equals(temp.toString())){return s;}
        }
        return "";
    }
}