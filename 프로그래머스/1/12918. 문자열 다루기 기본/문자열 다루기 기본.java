class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            for(int i=0; i<s.length(); i++){
                if (0 <= (s.charAt(i) - '0') && (s.charAt(i) - '0') <= 9) continue;
                else return false;
            }
        } else return false;
        return true;
    }
}