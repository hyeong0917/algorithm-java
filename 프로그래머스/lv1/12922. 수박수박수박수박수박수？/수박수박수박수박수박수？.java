class Solution {
    public String solution(int n) {
        char[] arr = new char[n];
        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                arr[i] = '수';
            } else {
                arr[i] = '박';
            }
        }
        String answer = new String(arr);
        return answer;
    }
}