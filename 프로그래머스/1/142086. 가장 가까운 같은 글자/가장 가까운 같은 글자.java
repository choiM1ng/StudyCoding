class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0; i<answer.length; i++){
            answer[i] = -1;
        }
        
        int count = 1;
        for(int i=1; i<s.length(); i++){
            String temp = s.substring(i, i+1);
            for(int j=i-1; j>=0; j--){
                if(temp.equals(s.substring(j, j+1))) {
                    answer[i] = count;
                    break;
                }
                else count++;
            }
            count = 1;
        }
        return answer;
    }
}