class Solution {
    public int[] solution(int brown, int yellow) {
        int width, height;
        int[] answer = new int[2];
        for(int i = 1; i <= brown + yellow; i++) {
            height = i;
            if((brown + yellow) % i != 0) continue;
            width = (brown + yellow) / i;
            
            if(2 * width + 2 * (height - 2) == brown) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}