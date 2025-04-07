class Solution {
    boolean solution(String s) {
        int pnum = 0;
        int ynum = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'P' || c == 'p'){
                pnum++;
            } else if(c == 'Y' || c == 'y'){
                ynum++;
            }
        }
        return pnum == ynum;
    }
}