import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> s = new HashSet<>();
        for(int i : nums) {
            s.add(i);
        }
        
        if(s.size() >= nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = s.size();
        }
        
        return answer;
    }
}