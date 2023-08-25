import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        //도시의 이름을 모두 소문자로 변환
        for(int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toLowerCase();
        }
        
        //로직을 처리할 큐와 셋 생성
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        
        //캐시사이즈가 0이면 도시 * 5의 시간이 걸림
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        
        //모든 도시를 처리하기
        for(String s : cities) {
            int size = set.size();
            set.add(s);
            //이미 도시가 존재하는 경우 큐에서 도시를 빼고 가장 최근으로 넣는다.
            if(set.size() == size) {
                answer += 1;
                int qSize = q.size();
                for(int i = 0; i < qSize; i++) {
                    String str = q.poll();
                    if(!str.equals(s)) q.add(str);
                }
                q.add(s);
                if(q.size() > cacheSize) {
                    String str = q.poll();
                    set.remove(str);
                }
            }
            //도시가 캐시에 존재하지 않는 경우
            else {
                answer += 5;
                q.add(s);
                if(q.size() > cacheSize) {
                    String str = q.poll();
                    set.remove(str);
                }
            }
        }
        
        return answer;
    }
}