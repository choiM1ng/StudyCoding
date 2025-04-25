class Solution {
    public int solution(int n) {
        String temp = Integer.toString(n, 3);
        String reverse = new StringBuilder(temp).reverse().toString();
        
        return Integer.parseInt(reverse, 3);
    }
}