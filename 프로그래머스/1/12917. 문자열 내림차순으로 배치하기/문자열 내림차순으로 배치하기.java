import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        for(int i=temp.length-1; i>=0; i--){
            answer += String.valueOf(temp[i]);
        }
        return answer;
    }
}