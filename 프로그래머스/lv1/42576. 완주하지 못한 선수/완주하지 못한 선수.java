import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> members = new HashMap<>();
        for(String s : participant) {
            if(members.containsKey(s)) {
                members.put(s, members.get(s) + 1);
            }
            else {
                members.put(s, 1);
            }
        }
        for(String s : completion) {
            if(members.containsKey(s)) {
                members.put(s, members.get(s) - 1);
            }
        }
        for(String s : participant) {
            if(members.get(s) > 0) {
                return s;
            }
        }
        String answer = "";
        return answer;
    }
}