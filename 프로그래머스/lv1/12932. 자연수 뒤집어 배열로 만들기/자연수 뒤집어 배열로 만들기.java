class Solution {
    public int[] solution(long n) {
        //정수 n을 문자열로 변환
        String s = Long.toString(n);
        
        //문자열 길이만큼 반복하면서 StringBuilder객체에 넣어준다.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        
        //StringBuilder 메서드를 이용하여 순서를 뒤집는다.
        sb.reverse();
        
        //StringBuilder 객체를 다시 문자열로 변환
        String last = sb.toString();
        
        //문자열의 길이만큼 정수 배열을 선언하고, 배열에 담는다.
        int[] answer = new int[last.length()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = last.charAt(i) - '0';
        }
        
        return answer;
    }
}