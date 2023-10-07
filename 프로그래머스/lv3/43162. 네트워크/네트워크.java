class Solution {
    int answer;
    boolean[] isVisited;
    
    void dfs(int[][] computers, int index) {
        isVisited[index] = true;
        
        for(int i = 0; i < computers[index].length; i++) {
            if(!isVisited[i] && computers[index][i] == 1) {
                isVisited[i] = true;
                dfs(computers, i);
            }
        }
    }
    public int solution(int n, int[][] computers) {
        isVisited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            //방문하지 않은 모든 컴퓨터마다 dfs수행
            if(!isVisited[i]) {
                dfs(computers, i);
                answer++;
            }
        }
        
        return answer;
    }
}