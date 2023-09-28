import java.util.*;

class Solution {
    private Set<Integer> getPrimes(int acc, List<Integer> numbers) {
        Set<Integer> primes = new HashSet<>();
        if(isPrime(acc)) primes.add(acc);
        
        for(int i = 0; i < numbers.size(); i++) {
            int nextAcc = acc * 10 + numbers.get(i);
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(i);
            primes.addAll(getPrimes(nextAcc, nextNumbers));
        }
        return primes;
    }
    
    //acc가 소수인지 검사하는 메서드 구현
    private boolean isPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public int solution(String numbers) {
        List<Integer> num = new ArrayList<>();
        for(int i = 0; i < numbers.length(); i++) {
            num.add(numbers.toCharArray()[i] - '0');
        }
        Set<Integer> res = new HashSet<>();
        res = getPrimes(0, num);
        int answer = 0;
        answer = res.size();
        return answer;
    }
}