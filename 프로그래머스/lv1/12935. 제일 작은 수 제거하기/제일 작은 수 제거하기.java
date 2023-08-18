import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        
        //가장 작은 수 찾기
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }
        
        //가장 작은 수 제외하고 큐에 등록
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != min) q.add(arr[i]);
        }
        
        //큐가 비어있다면 -1 등록
        if(q.isEmpty()) q.add(-1);
        
        //큐를 배열로 변환
        int[] answer = new int[q.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}