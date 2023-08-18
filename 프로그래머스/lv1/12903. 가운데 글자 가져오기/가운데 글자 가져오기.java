class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            int n = i * 2;
            if(n == len || n + 1 == len || n + 2 == len) answer += arr[i];
        }
        return answer;
    }
}