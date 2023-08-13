class Solution {
    //n만큼 문자를 미는 메서드
    private char push(char c, int n) {
        //알파벳이 아닌 공백이면 공백으로 리턴
        if(!Character.isAlphabetic(c)) return c;
        
        //c가 대문자이면 offset을 A, 소문자이면 a로 설정
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        
        //대문자와 소문자 모두 0~25의 정수로 변환
        int position = c - offset;
        
        //범위넘어가지 않도록 %연산을 이용해서 문자 밀기
        position = (position + n) % 26;
        
        return (char) (position + offset);
    }
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            sb.append(push(c, n));
        }
        
        return sb.toString();
        
    }
}