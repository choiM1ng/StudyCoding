import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i : arr){
            if(i%divisor == 0){
                temp[index] = i;
                index++;
            }
        }
        if(index == 0) return new int[]{-1};
        int[] answer = Arrays.copyOfRange(temp, 0, index);
        Arrays.sort(answer);
        return answer;
    }
}