class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i = 0;
        for(String s : seoul) {
            if(s.equals("Kim")) {
                break;
            }
            i++;
        }
        answer = "김서방은 " + i + "에 있다";
        return answer;
    }
}