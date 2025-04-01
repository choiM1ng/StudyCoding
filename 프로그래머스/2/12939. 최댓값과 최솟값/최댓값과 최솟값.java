import java.util.*;

class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        Long[] lNum = new Long[num.length];
        for(int i=0; i<num.length; i++){
            lNum[i] = Long.parseLong(num[i]);
        }
        Arrays.sort(lNum);
        String answer = "" + lNum[0] + " " + lNum[lNum.length-1];
        return answer;
    }
}