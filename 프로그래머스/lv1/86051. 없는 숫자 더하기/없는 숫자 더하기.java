import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Set<Integer> num = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            num.add(numbers[i]);
        }
        int answer = 0;
        for(int i = 0; i < 10; i++) {
            if(num.contains(i)) continue;
            answer += i;
        }
        return answer;
    }
}