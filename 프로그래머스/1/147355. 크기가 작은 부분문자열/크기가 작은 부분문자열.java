class Solution {
    public int solution(String t, String p) {
        int plength = p.length();
        int answer = 0;
        long pNum = Long.parseLong(p);
        for(int i=plength; i<=t.length(); i++){
            long num = Long.parseLong(t.substring(i-plength, i));
            if(num <= pNum) answer++;
        }
        return answer;
    }
}