import java.util.*;

class Solution {
    //사람들의 번호와 무게를 담을 Data 클래스 선언
    private static class Data {
        public final int index;
        public final int weight;
        
        public Data(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }
    }
    
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Queue<Data> q = new LinkedList<>();
        Stack<Data> s = new Stack<>();
        Arrays.sort(people);
        
        //사람들의 번호와 몸무게를 큐와 스택에 등록
        for(int i = 0; i < people.length; i++) {
            q.add(new Data(i, people[i]));
            s.push(new Data(i, people[i]));
        }
        
        while(!q.isEmpty() && !s.isEmpty()) {
            Data qData = q.peek();
            Data sData = s.peek();
            if(qData.index < sData.index) {
                if(qData.weight + sData.weight > limit) {
                    answer++;
                    s.pop();
                } else {
                    answer++;
                    s.pop();
                    q.poll();
                }
            } else if(qData.index == sData.index) {
                answer++;
                s.pop();
                q.poll();
            } else {
                break;
            }
        }
        
        return answer;
    }
}