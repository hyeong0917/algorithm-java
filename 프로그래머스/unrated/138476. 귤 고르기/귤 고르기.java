import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        //map에 귤의 크기와 각각의 개수를 등록
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        //귤의 개수를 리스트에 등록(무게는 신경쓰지 않음)
        for(int i : map.keySet()) {
            list.add(map.get(i));
        }
        
        //리스트를 내림차순 정렬하고 스택에 담아 가장 작은 수가 위에 오도록 함
        Collections.sort(list, (i1, i2) -> i2 - i1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        
        //적은 개수부터 제거
        for(int i = 0; i < tangerine.length - k; i++) {
            int n = stack.pop();
            stack.push(n - 1);
            if(stack.peek() == 0) stack.pop();
        }
        
        //남아있는 스택의 크기가 귤의 종류의 수와 같음
        answer = stack.size();
        
        return answer;
    }
}