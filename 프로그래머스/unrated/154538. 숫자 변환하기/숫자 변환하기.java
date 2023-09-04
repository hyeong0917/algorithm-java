import java.util.*;

class Solution {
    private static class State {
        private final int acc;
        private final int ans;
        
        State(int acc, int ans) {
            this.acc = acc;
            this.ans = ans;
        }
    }
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<State> q = new LinkedList<>();
        Set<Integer> isVisited = new HashSet<>();
        q.add(new State(x, 0));
        
        while(!q.isEmpty()) {
            State state = q.poll();
            
            if(isVisited.contains(state.acc)) continue;
            isVisited.add(state.acc);
            
            if(state.acc == y) {
                answer = state.ans;
                return answer;
            }
            
            if(state.acc > y) continue;
            
            if(!isVisited.contains(state.acc + n) && state.acc + n <= y) {
                q.add(new State(state.acc + n, state.ans + 1));
            }
            if(!isVisited.contains(state.acc * 2) && state.acc * 2 <= y) {
                q.add(new State(state.acc * 2, state.ans + 1));
            }
            if(!isVisited.contains(state.acc * 3) && state.acc * 3 <= y) {
                q.add(new State(state.acc * 3, state.ans + 1));
            }
        }
        
        return -1;
    }
}