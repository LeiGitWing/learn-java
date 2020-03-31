import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("输入三角形的行数: ");
        int n = keyboard.nextInt();  // 存储输入的行数
        int[][] a = new int[n][n]; // 输入的三角形
        int[][] b = new int[n][n];
        int min;

        System.out.println("输入数字三角形: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = keyboard.nextInt();
            }
        }

        b[0][0] = a[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {         // 左边
                    b[i][j] = b[i-1][j] + a[i][j];
                } else if (j == i) {  // 右边
                    b[i][j] = b[i-1][j-1]+a[i][j];
                } else {  // 三角形的其他部分
                    b[i][j] = Math.min(b[i-1][j-1], b[i-1][j]) + a[i][j];
                }
            }
        }

        min = b[n-1][0];
        for (int i = 1; i < b[n-1].length; i++) {
            if (b[n-1][i] < min) {
                min = b[n-1][i];
            }
        }
        System.out.println("最小路径总和是" + min);
    }
} 