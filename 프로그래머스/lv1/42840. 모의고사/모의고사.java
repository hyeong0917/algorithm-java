import java.util.*;

class Solution {
    private static final int[][] RULES = {
        {1, 2, 3, 4, 5},
        {2, 1, 2, 3, 2, 4, 2, 5},
        {3, 3, 1, 1 ,2, 2, 4, 4, 5, 5}
    };
    
    //각각의 사람들이 문제 번호에 대해 그 문제에 뭐라고 찍는지 리턴하는 메서드 구현
    private int getPicked(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }
    
    public int[] solution(int[] answers) {
        //사람들의 점수를 담는 배열 생성
        int score[] = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            for(int person = 0; person < 3; person++) {
                if(getPicked(person, i) == answers[i]) {
                    score[person]++;
                }
            }
        }
        
        int max = 0;
        
        for(int i = 0; i < 3; i++) {
            if(score[i] >= max) {
                max = score[i];
            }
        }
        List<Integer> answer1 = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(score[i] == max) {
                answer1.add(i);
            }
        }
        int[] answer = new int[answer1.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer1.get(i) + 1;
        }
        return answer;
    }
}