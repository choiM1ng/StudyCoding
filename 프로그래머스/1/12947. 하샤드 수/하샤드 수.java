class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String num = String.valueOf(x);
        char[] nums = num.toCharArray();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i] - '0';
        }
        if(x%sum == 0) return answer;
        return false;
    }
}