import java.util.Scanner;

public class bt5 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        int dem = 0;
        for (int i = 1; i < n - 1; ++i) {
            if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                ++dem;
            }
        }
        System.out.println("Số đỉnh núi: " + dem);
    }
}