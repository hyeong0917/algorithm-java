import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;
        
        Map<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);
        for(int i = 1; i < words.length; i++) {
            char endWord = words[i - 1].charAt(words[i - 1].length() - 1);
            char startWord = words[i].charAt(0);
            if(map.containsKey(words[i]) || endWord != startWord) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            } else {
                map.put(words[i], 1);
            }
        }

        return answer;
    }
}