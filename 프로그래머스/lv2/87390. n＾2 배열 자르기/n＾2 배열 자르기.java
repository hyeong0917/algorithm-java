import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[Long.valueOf(right - left).intValue() + 1];
        
        List<Long> list = new ArrayList<>();
        for(long i = left; i <= right; i++) {
            list.add(Math.max(i / n, i % n) + 1);
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = Long.valueOf(list.get(i)).intValue();
        }
        
        return answer;
    }
}