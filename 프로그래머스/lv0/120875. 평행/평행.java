class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double grad1;
        double grad2;
        
        //1,2 <-> 3,4
        grad1 = (double)(dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        grad2 = (double)(dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
        if(grad1 == grad2) {
            return 1;
        }
        
        //1,3 <-> 2,4
        grad1 = (double)(dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        grad2 = (double)(dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
        if(grad1 == grad2) {
            return 1;
        }
        
        //1,4 <-> 2,3
        grad1 = (double)(dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        grad2 = (double)(dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
        if(grad1 == grad2) {
            return 1;
        }
        
        return answer;
    }
}