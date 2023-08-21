class Solution {
    public String solution(String s) {
        String answer = "";
        
        //문자열을 char 배열로 변환
        char[] arr = s.toCharArray();
        
        int index = 0;
        for(char c : arr) {
            if(c == ' ') {
                index = 0;
                answer += " ";
                continue;
            }
            if(index % 2 == 0) {
                c = Character.toUpperCase(c);
                answer += c;
            } else {
                c = Character.toLowerCase(c);
                answer += c;
            }
            index++;
        }
        
        return answer;
    }
}