class Solution {
    public String solution(int n) {
        String su = "수";
        String bak = "박";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            if(i%2==0) sb.append(su);
            else sb.append(bak);
        }
        return sb.toString();
    }
}