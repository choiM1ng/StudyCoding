class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ' ') answer += " ";
            else {
                for(int j=0; j<n; j++){
                    if(c == 'z') c = 'a';
                    else if(c == 'Z') c = 'A';
                    else c++;
                }
                answer += Character.toString(c);
            }
        }
        return answer;
    }
}