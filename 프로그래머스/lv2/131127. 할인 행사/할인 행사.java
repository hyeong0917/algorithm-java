import java.util.*;

class Solution {
    private boolean isPossible(Map<String, Integer> map, List<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) - 1);
            }
        }
        for(String s : map.keySet()) {
            if(map.get(s) != 0) return false;
        }
        return true;
    }
    
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        //반복할 날짜수
        int days = discount.length - 9;
        
        //리스트 생성, 10일간 할인하는 제품 등록 , 맵 생성, 제품과 수량 등록
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int a = 0; a < days; a++) {
            for(int i = 0; i < 10; i++) {
                list.add(discount[i + a]);
            }
            for(int j = 0; j < want.length; j++) {
                map.put(want[j], number[j]);
            }
            //할인한다면 answer증가
            if(isPossible(map, list)) answer++;
            //리스트, 맵 초기화
            list.clear();
            map.clear();
        }
        
        return answer;
    }
}