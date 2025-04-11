class Solution {
    public String solution(String phone_number) {
        String[] phoneNumber = new String[phone_number.length()]; 
        for(int i=0; i<phone_number.length(); i++){
            phoneNumber[i] = phone_number.substring(i, i+1);
        }
        for(int i=phoneNumber.length-5; i>=0; i--){
            phoneNumber[i] = "*";
        }
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<phoneNumber.length; i++){
            answer.append(phoneNumber[i]);
        }
        return answer.toString();
    }
}