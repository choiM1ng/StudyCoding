class Solution {
    public String solution(String phone_number) {
        char[] phoneNumber = phone_number.toCharArray();
        for(int i=0; i<phoneNumber.length - 4; i++){
            phoneNumber[i] = '*';
        }
        return String.valueOf(phoneNumber);
    }
}