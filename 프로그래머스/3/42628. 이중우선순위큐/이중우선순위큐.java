import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pqOr = new PriorityQueue<>();
        PriorityQueue<Integer> pqNa = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int a = 0, b = 0;
        
        for(String oper : operations) {
            String[] s = oper.split(" ");
            
            if(s[0].equals("I")) {
                pqOr.add(Integer.valueOf(s[1]));
                pqNa.add(Integer.valueOf(s[1]));
                a++;
            } else if(s[0].equals("D")) {
                if(s[1].equals("-1") && a > b) {
                    pqOr.poll();
                    b++;
                } else if(s[1].equals("1") && a > b) {
                    pqNa.poll();
                    b++;
                }
            }
        }
        int[] answer = new int[2];
        
        while(!pqOr.isEmpty()) {
            int i = pqOr.poll();
            set.add(i);
        }
        while(!pqNa.isEmpty()) {
            int i = pqNa.poll();
            if(set.contains(i)) {
                list.add(i);
            }
        }
        if(a <= b) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = Collections.max(list);
            answer[1] = Collections.min(list);
        }
        
        return answer;
    }
}