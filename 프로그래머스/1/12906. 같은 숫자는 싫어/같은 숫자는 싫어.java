import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        answer[0] = arr[0];
        
        int now = arr[0];
        int index = 0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] != now){
                answer[++index] = arr[i];
                now = arr[i];
            }
        }
        return Arrays.copyOfRange(answer, 0, index+1);
    }
}