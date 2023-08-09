class Solution {
    public int solution(int num) {
        int answer = 0;
        long x = Long.valueOf(num);
        while(x != 1) {
            if(x % 2 == 0) {
                x /= 2;
            } else {
                x *= 3;
                x += 1;
            }
            answer++;
            if(answer == 500) {
                return -1;
            }
        }
        return answer;
    }
}