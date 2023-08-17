import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        //인덱스를 큐에 등록
        for(int i = 0; i < priorities.length; i++) {
            queue.add(i);
        }
        
        //스택에 넣기 위해 배열을 복사하고 오름차순 정렬
        int[] arr = new int[priorities.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = priorities[i];
        }
        Arrays.sort(arr);
        
        //스택에 우선순위들을 등록
        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        
        while(!queue.isEmpty()) {
            int value = queue.poll();
            if(priorities[value] == stack.peek()) {
                stack.pop();
                answer++;
                if(value == location) {
                    break;
                }
            } else {
                queue.add(value);
            }
        }
        
        return answer;
    }
}