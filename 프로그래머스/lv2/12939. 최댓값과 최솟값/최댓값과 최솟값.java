import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(arr2);
        answer = Integer.toString(arr2[0]) + " " + Integer.toString(arr2[arr2.length - 1]);
        return answer;
    }
}