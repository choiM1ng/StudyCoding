class Solution {
    public long solution(long num) {
        int answer = 0;
        int count = 0;
        while(count < 500){
            if(num == 1){
                answer = count;
                break;
            } 
            if(num%2==0) num /= 2;
            else num = num*3 + 1;
            count++;
        }
        if(count == 500) return -1;
        return answer;
    }
}