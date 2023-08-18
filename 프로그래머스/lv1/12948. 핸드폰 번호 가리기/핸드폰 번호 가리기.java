class Solution {
    public String solution(String phone_number) {
        
        char[] arr = phone_number.toCharArray();
        
        int len = phone_number.length();
        for(int i = 0; i < len - 4; i++) {
            arr[i] = '*';
        }
        
        String answer = new String(arr);
        return answer;
    }
}