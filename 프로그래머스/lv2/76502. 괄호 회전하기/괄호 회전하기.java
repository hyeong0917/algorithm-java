import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        //회전할 수 있는 길이는 0 ~ 문자열 길이 - 1이다.
        for(int i = 0; i < s.length(); i++) {
            //i만큼 회전한 문자열을 스택에 담아야한다.
            //i만큼 문자열 회전시키기 -> 문자열을 두개로 자른후 순서 바꾸어서 결합
            String front = s.substring(0, i);
            String back = s.substring(i, s.length());
            String str = back + front;
            
            //회전을 했으므로 스택에 담으면 됨
            Stack<Character> stack = new Stack<>();
            int flag = 0;
            
            for(char c : str.toCharArray()) {
                if(c == '{' || c == '[' || c== '(') {
                    stack.add(c);
                } else {
                    if(stack.isEmpty()) {
                        flag = 1;
                        break;
                    }
                    else if((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}') || (stack.peek() == '[' && c == ']')) {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty() && flag == 0) {
                answer++;
            }
            
        }
        return answer;
    }
}