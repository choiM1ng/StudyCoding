import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int s, e, k;
        for(int i=0; i<commands.length; i++){
            s = commands[i][0] - 1;
            e = commands[i][1];
            k = commands[i][2] - 1;
            int[] temp = Arrays.copyOfRange(array, s, e);
            Arrays.sort(temp);
            answer[i] = temp[k];
        }
        return answer;
    }
}