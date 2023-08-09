class Solution {
    public long solution(long n) {
        long answer = -1;
        double route = Math.sqrt(n);
        if(route % 1 == 0) {
            long x = (long)route + 1;
            return x * x;
        }
        return answer;
    }
}