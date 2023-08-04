class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //정수 n을 3진법의 문자열으로 변환
        String s1 = Integer.toString(n, 3);
        
        //문자열을 뒤집기 위해 StringBuilder 메서드 사용
        String reversed = new StringBuilder(s1).reverse().toString();
        
        //뒤집힌 3진법 문자열을 다시 10진법의 정수로 표현
        answer = Integer.parseInt(reversed, 3);
        
        return answer;
    }
}