class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int customerMax = 0;
            for(int j = 0; j < accounts[i].length; j++){
                customerMax = customerMax + accounts[i][j];
            }
            if (customerMax > max){
                max = customerMax;
            }
            customerMax = 0;
        }
        return max;
    }
}