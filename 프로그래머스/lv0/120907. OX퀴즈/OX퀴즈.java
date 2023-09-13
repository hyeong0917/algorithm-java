class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++) {
            String[] res = quiz[i].split(" ");
            if(res[1].equals("-")) {
                if(Integer.parseInt(res[0]) - Integer.parseInt(res[2]) == Integer.parseInt(res[4])) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
            else {
                if(Integer.parseInt(res[0]) + Integer.parseInt(res[2]) == Integer.parseInt(res[4])) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}