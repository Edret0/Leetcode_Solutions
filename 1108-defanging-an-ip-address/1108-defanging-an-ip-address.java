class Solution {
    public String defangIPaddr(String address) {
        String ans ="";
        for(int i = 0; i < address.length(); i++){
            if(Character.isDigit(address.charAt(i))){
                ans+= address.charAt(i);
            }
            if(address.charAt(i) == '.'){
                ans+= "[.]";
            }
        }
        return ans;
    }
}