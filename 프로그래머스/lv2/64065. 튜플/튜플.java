import java.util.*;

class Solution {
    public int[] solution(String s) {
        String str = s.replace("{", "").replace("}", "");
        String[] tuples = str.split(",");
        
        Set<String> set = new HashSet<>();
        for(String t : tuples) {
            set.add(t);
        }
        int[] answer = new int[set.size()];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String t : tuples) {
            if(map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> (map.get(o1).compareTo(map.get(o2))));
        
        for(int i = 0; i < answer.length; i++) {
            answer[answer.length - i - 1] = Integer.parseInt(list.get(i));
        }
        
        return answer;
    }
}