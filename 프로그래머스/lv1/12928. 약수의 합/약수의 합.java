class Solution {
    
    private int countPrime(int number) {
        int sum = 0;
        
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public int solution(int n) {
        int answer = countPrime(n);
        return answer;
    }
}