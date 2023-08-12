import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int k = 0;
        for(int[] arr : commands) {
            List<Integer> sorted = new ArrayList<>();
            for(int i = arr[0] - 1; i < arr[1]; i++) {
                sorted.add(array[i]);
            }
            Collections.sort(sorted);
            answer[k] = sorted.get(arr[2] - 1);
            k++;
        }
        return answer;
    }
}