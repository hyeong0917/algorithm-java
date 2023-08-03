class Solution {
    private boolean check(String s) {
        if(s.length() == 4 || s.length() == 6) {
            //모두 숫자면 true를 리턴, 하나라도 숫자가 아니라면 false를 리턴
            return s.matches("[0-9]*");
        }
        return false;
    }
    
    public boolean solution(String s) {
        boolean answer = check(s);
        return answer;
    }
}