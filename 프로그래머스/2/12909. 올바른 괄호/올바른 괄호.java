import java.util.*;

class Solution {
    boolean solution(String s) {
        if (s.charAt(s.length()-1) == '(') return false;
        else {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()){
                if(c == '(') stack.push(c);
                else {
                    if(stack.isEmpty()) return false;
                    stack.pop();
                }
            }
            if(stack.isEmpty()) return true;
            else return false;
        }
    }
}