import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //반복할 개수 n만큼 입력받기
        int n = Integer.parseInt(br.readLine());

        //n이 0이면 난이도는 0
        if(n == 0) {
            System.out.println(0);
            return;
        }

        //n만큼 저장할 배열 생성
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //몇 명을 제외할 지 결정
        double x = ((double) n ) * 0.15;
        int people = (int) Math.round(x);

        //난이도 순대로 정렬
        Arrays.sort(arr);

        int sum = 0;
        int count = n - (2 * people);

        //합 구하기
        for(int i = 0; i < count; i++) {
            sum += arr[people + i];
        }

        //평균 구하기
        System.out.println(Math.round((double) sum / count));
    }
}