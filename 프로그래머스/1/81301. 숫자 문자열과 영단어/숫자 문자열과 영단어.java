class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') answer.append(s.charAt(i));
            else {
                switch (s.charAt(i)) {
                    case 'z': 
                        answer.append('0'); 
                        i += 3;
                        break;
                    case 'o': 
                        answer.append('1');
                        i += 2;
                        break;
                    case 't': 
                        if(s.charAt(i+1) == 'w') {
                            answer.append('2');
                            i += 2;
                            break;
                        } else {
                            answer.append('3');
                            i += 4;
                            break;
                        }
                    case 'f':
                        if(s.charAt(i+1) == 'o') {
                            answer.append('4');
                            i += 3;
                            break;
                        } else {
                            answer.append('5');
                            i += 3;
                            break;
                        }
                    case 's':
                        if(s.charAt(i+1) == 'i') {
                            answer.append('6');
                            i += 2;
                            break;
                        } else {
                            answer.append('7');
                            i += 4;
                            break;
                        }
                    case 'e':
                        answer.append('8');
                        i += 4;
                        break;
                    case 'n':
                        answer.append('9');
                        i += 3;
                        break;
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}