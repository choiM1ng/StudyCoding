class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++){
            if(money >= price*i) money -= price*i;
            else {
                answer += (price*i)-money;
                money = 0;
            }
        }
        return answer;
    }
}