class Solution {
    public int[] solution(int n, int m) {
        int num1 = 1, num2 = m;
        for(int i=2; i<=n; i++){
            if(n%i==0 && m%i==0) num1 = i;
        }
        
        int j = 1;
        for(int i=m; ; i=m*(++j)){
            if(i%n==0 && i%m==0) {
                num2 = i;
                break;
            }
        }
        return new int[] {num1, num2};
    }
}