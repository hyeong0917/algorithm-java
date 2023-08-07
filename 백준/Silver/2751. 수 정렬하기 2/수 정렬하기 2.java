import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //반복할 횟수 n 입력 받기
        int n = Integer.parseInt(br.readLine());

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }

        //수 정렬
        Collections.sort(arr);

        for(int i : arr) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}