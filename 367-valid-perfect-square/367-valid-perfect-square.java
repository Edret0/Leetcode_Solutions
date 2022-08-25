class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1, end = num;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int divideCheck = num / mid;
            int remainder = num % mid;
            if(divideCheck == mid && remainder == 0){
                return true;
            }
            else if(divideCheck > mid){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
        
    }
}