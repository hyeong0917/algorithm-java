import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        char[] arr = s.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        
        //문자열을 모두 큐에 등록
        for(char c: arr) {
            queue.add(c);
        }
        
        //큐의 제일 앞 글자를 스택에 등록
        stack.push(queue.poll());
        
        //큐에서 뺀 글자와 스택의 가장 위의 글자가 같다면 스택에서 제거
        while(!queue.isEmpty()) {
            char c = queue.poll();
            if(stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            if(c == stack.peek()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
        if(stack.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}