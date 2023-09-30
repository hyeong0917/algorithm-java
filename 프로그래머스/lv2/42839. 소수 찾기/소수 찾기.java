import java.util.*;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    public void recursive(String comb, String others) {
        if(!comb.equals("") && isPrime(comb)) {
            numberSet.add(Integer.valueOf(comb));
        }
        
        for(int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }
    public boolean isPrime(String num) {
        int number = Integer.valueOf(num);
        if(number <= 1) return false;
        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
    public int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);
        answer = numberSet.size();
        return answer;
    }
}