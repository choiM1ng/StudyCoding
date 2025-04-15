class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        while(left <= right){
            boolean num = false;
            for(int i=1; i<left; i++){
                if(left%i==0) num = !num; 
            }
            if(num) answer += left;
            else answer -= left;
            left++;
        }
        return answer;
    }
}