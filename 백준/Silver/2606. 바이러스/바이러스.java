import java.util.*;

class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        //그래프 정보 입력
        int x, y;
        for(int i = 0; i < M; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            graph[x][y] = true;
            graph[y][x] = true;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        while (!stack.isEmpty()) {
            int n = stack.pop();

            if(visited[n]) continue;
            visited[n] = true;

            for(int i = 0; i < graph[n].length; i++) {
                if(!graph[n][i]) continue;
                stack.push(i);
            }
        }

        for(boolean b : visited) {
            if(b) answer++;
        }

        System.out.println(answer - 1);

    }
}