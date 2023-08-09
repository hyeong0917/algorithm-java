import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            sb.append(c);
        }
        String res = sb.reverse().toString();
        
        answer = Long.parseLong(res);
        
        return answer;
    }
}