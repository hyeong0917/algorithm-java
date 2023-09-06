class Solution {
    public int answer = 0;
    public boolean isVisited[];
    
    public void dfs(int count, int k, int[][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            if(!isVisited[i] && dungeons[i][0] <= k) {
                isVisited[i] = true;
                dfs(count + 1, k - dungeons[i][1], dungeons);
                isVisited[i] = false;
            }
        }
        answer = Math.max(answer, count);
    }
    
    public int solution(int k, int[][] dungeons) {
        
        isVisited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        
        return answer;
    }
}