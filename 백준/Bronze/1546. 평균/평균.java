import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int max = 0;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            max = Math.max(x, max);
            sum += x;
        }
        float avg = (float) (sum * 100) / max / N;

        System.out.println(avg);
    }
}