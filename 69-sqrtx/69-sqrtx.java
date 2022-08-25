

class Solution {
    public int mySqrt(int x) {
        
        if(x <= 1){
            return x;
        }
        for(long i = 0; i < x; i++){
            if(i * i == x){
                return (int)i;
            }
            else if((i + 1) * (i + 1) > x){
                return (int)i;
            }
        }
        return x;
    }
}

