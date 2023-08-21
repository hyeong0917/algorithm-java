import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            map.put(br.readLine(), 1);
        }

        List<String> answer = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) answer.add(name);
        }

        Collections.sort(answer);
        bw.write(answer.size() + "\n");
        for(String s : answer) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
        
        bw.close();
        br.close();
    }
}