class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
       
        for (char c : s.toCharArray()){
            if(c == ' ') {
                answer.append(c);
            } else {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + n) % 26 + base);
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}