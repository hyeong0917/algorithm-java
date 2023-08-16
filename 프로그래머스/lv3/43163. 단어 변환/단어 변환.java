import java.util.*;

class Solution {
    private static class State {
        private final String word;
        private final int step;
        
        public State(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }
    
    private static boolean isConvertable(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        int t = 0;
        for(int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                t++;
            }
        }
        
        return t == 1;
    }
    
    public int solution(String begin, String target, String[] words) {
        boolean[] isVisited = new boolean[words.length];
        
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(begin, 0));
        
        while(!queue.isEmpty()) {
            State state = queue.poll();
            
            if(state.word.equals(target)) {
                return state.step;
            }
            
            for(int i = 0; i < words.length; i++) {
                String next = words[i];
                
                if(!isConvertable(state.word, next)) continue;
                
                if(isVisited[i]) continue;
                
                isVisited[i] = true;
                queue.add(new State(next, state.step + 1));
            }
        }
        return 0;
    }
}