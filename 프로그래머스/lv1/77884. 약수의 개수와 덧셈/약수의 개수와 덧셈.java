class Solution {
    //약수의 개수를 세는 메서드
    private static int countDivisor(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) count++;
        }
        return count;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            if(countDivisor(i) % 2 == 0) {
                answer += i;
            }
            else {
                answer -= i;
            }
        }
        return answer;
    }
}