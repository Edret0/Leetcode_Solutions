class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzList = new ArrayList();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                fizzList.add(i-1,"FizzBuzz");
            }
            else if(i % 3 == 0 ){
                fizzList.add(i-1,"Fizz");
            }
            else if(i % 5 == 0 ){
                fizzList.add(i-1,"Buzz");
            }
            else{
                String result = Integer.toString(i);
                fizzList.add(i-1,result);
            }
        }
        return fizzList;
        
    }
}