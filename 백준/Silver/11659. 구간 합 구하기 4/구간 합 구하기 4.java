import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] sum = new int[N + 1];
        arr[0] = 0;
        sum[0] = 0;
        for(int i = 1; i < N + 1; i++) {
            arr[i] = sc.nextInt();
            sum[i] = sum[i - 1] + arr[i];
        }
        for(int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(sum[y] - sum[x - 1]);
        }
    }
}