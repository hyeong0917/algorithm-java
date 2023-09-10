import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 1; i <= order.length; i++) {
            q.add(i);
        }
        
        for(int i = 0; i < order.length; i++) {
            while(!q.isEmpty() && q.peek() < order[i]) {
                int n = q.poll();
                s.push(n);
            }
            if(!q.isEmpty() && q.peek() == order[i]) {
                q.poll();
                answer++;
            } else if(q.isEmpty() || q.peek() > order[i]) {
                if(s.peek() == order[i]) {
                    s.pop();
                    answer++;
                }
                else {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}