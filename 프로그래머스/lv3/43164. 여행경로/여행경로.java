import java.util.*;

class Solution {
    List<String> allRoute = new ArrayList<>();
    boolean[] isVisited;
    
    public void visitAll(String[][] tickets, String start, String route, int count) {
        if(count == tickets.length) {
            allRoute.add(route);
            return;
        }
        
        for(int i = 0; i < tickets.length; i++) {
            if(start.equals(tickets[i][0]) && !isVisited[i]) {
                isVisited[i] = true;
                visitAll(tickets, tickets[i][1], route + "," + tickets[i][1], count + 1);
                isVisited[i] = false;
            }
        }
    }
    public String[] solution(String[][] tickets) {
        isVisited = new boolean[tickets.length];
        visitAll(tickets, "ICN", "ICN", 0);
        Collections.sort(allRoute);
        
        return allRoute.get(0).split(",");
    }
}