import java.util.*;

class Solution {
    //최소공배수를 구하는 메서드 작성
    private int getLcm(int a, int b) {
        if(b % a == 0) {
            return b;
        }
        int n = 0;
        for(int i = 1; i <= b; i++) {
            if(a % i == 0 & b % i == 0) {
                n = i;
            }
        }
        return a * b / n;
    }
    
    public int solution(int[] arr) {
        int answer = 0;
        
        Stack<Integer> s = new Stack<>();
        Arrays.sort(arr);
        
        //위에 가장 작은 수가 올라가도록 스택에 등록
        for(int i = arr.length - 1; i >= 0; i--) {
            s.push(arr[i]);
        }
        
        //스택이 빌 때까지 두개씩 빼서 최소공배수를 계속 구함
        while(!s.isEmpty()) {
            int a = s.pop();
            int b = s.pop();
            int lcm = getLcm(a, b);
            s.push(lcm);
            
            if(s.size() == 1) {
                answer = s.pop();
            }
        }
        
        return answer;
    }
}