import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) {
            pq.add(s);
        }
        
        while(pq.peek() < K) {
            int min1 = pq.poll();
            int min2 = pq.poll();
            
            int mix = min1 + 2 * min2;
            pq.add(mix);
            answer++;
            
            if(pq.size() == 1 && pq.peek() < K) {
                return -1;
            }
        }
        
        return answer;
    }
}