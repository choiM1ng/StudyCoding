import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[] {-1};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }
        
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for(int num : arr){
            if(min != num) answer[index++] = num;
        }
        return answer;
    }
}