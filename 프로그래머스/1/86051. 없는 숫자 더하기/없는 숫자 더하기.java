class Solution {
    public int solution(int[] numbers) {
        int answer = 45;    //(1+9)*9/2 = 45
        for(int i : numbers){
            answer -= i;
        }
        return answer;
    }
}