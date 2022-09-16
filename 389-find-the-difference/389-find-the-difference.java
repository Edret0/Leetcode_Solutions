class Solution {
    public char findTheDifference(String s, String t) {
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        char answer = 'a';
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        for(int i = 0; i <tArr.length-1; i++){
            if(sArr[i] != tArr[i]){
                answer = tArr[i];
                return answer;
            }
        }
        answer = tArr[tArr.length-1];
        return answer;
    }
}