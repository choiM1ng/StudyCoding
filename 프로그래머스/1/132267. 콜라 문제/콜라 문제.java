class Solution {
    public int solution(int a, int b, int n) {
        int coke = n;
        int answer = 0;
        
        while(coke >= a) {
            answer += coke/a * b;
            coke = coke - (coke/a * a) + coke/a * b; 
        }
        
        return answer;
    }
}