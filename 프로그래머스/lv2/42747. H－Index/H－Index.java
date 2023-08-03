import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        //우선 배열을 정렬
        Arrays.sort(citations);
        int h = citations[citations.length - 1];
        
        //큰 수 부터 진행
        while(h >= 0) {
            int cnt = 0;
            for(int i = citations.length - 1; i >= 0; i--) {
                if(citations[i] - h >= 0) {
                    cnt++;
                }
                if(cnt >= h) {
                    return h;
                }
            }
            h--;
        }
        return answer;
    }
}