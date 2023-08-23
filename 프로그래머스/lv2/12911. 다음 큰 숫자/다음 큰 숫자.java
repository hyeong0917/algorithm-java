class Solution {
    private int countOne(int n) {
        String s = Integer.toString(n, 2);
        char[] arr = s.toCharArray();
        
        int count = 0;
        for(char c : arr) {
            if(c == '1') count++;
        }
        
        return count;
    }
    
    public int solution(int n) {
        int nowOne = countOne(n);
        int nextOne = countOne(n + 1);
        int k = n + 1;
        
        if(nextOne == nowOne) return k;
        
        while(nowOne != nextOne) {
            nextOne = countOne(k);
            k++;
        }
        
        return k - 1;
    }
}