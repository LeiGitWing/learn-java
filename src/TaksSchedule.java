import java.util.Scanner;

public class TaksSchedule {

    public static void main(String args[]) {
        int n = 6;    // 作业个数
        int[] a = {0, 2, 5, 7, 10, 5, 2};
        int[] b = {0, 3, 8, 4, 11, 3, 4};
        int minTime = 10000;
        int ba = 0;
        int[][] p = new int[500][n+1];

        // 假设只用机器A完成所有作业
        for (int k = 1; k <= n; k++) {          
            ba += a[k];                         
        
            for (int i = 0; i <= ba; i++) {
                p[i][k] = p[i][k-1]+b[k];
                if (i >= a[k]) {                // 当前时间是否满足其在机器a上运行
                p[i][k] = p[i][k] < p[i-a[k]][k-1] ? p[i][k] : p[i-a[k]][k-1];
                }
            }
        }

        for (int i = 0;i <= ba; i++){            // i是n个作业在A上运行时间
            int t = (p[i][n] > i ? p[i][n] : i); // p[i][n]是B上运行n个作业的时间
            if (minTime > t) {
                minTime = t;
            }               
        }

        System.out.println("minTime is " + minTime);
    }












    // int[] machineATime;
    // int[] machineBTime;
    // int[][] f;
    // int[] time; //处理作业的最短时间
    // int n = 0;


    // private static void read() {
    //     System.out.print("please enter the amount of tasks: ");
    //     Scanner keyboard = new Scanner(System.in);
    //     n = keyboard.nextInt();
    //     System.out.println("Please enter machine A's time to dealing with each task: ");
    //     for (int i = 1; i <= n; i++) {
    //         machineATime += i;
    //     }
    //     System.out.println("Please enter machine N's time to dealing with each task: ");
    //     for (int j = 1; j <= n; j++) {
    //         machineBTime += j;
    //     }
    // }

    // private static int min(int x, int y) {
    //     return x < y ? x : y;
    // }

    // private static int max(int x, int y) {
    //     return x > y ? x : y;
    // }

    // private static int schedule() {
    //     int sumA = machineATime[1];
    //     // k = 1时
    //     for (int x = 0; x < machineATime[1]; x++) {
    //         f[1][x] = machineBTime[1];
    //     }
    //     f[1][machineATime[1]] = min(machineBTime[1], machineATime[1]);
    //     // inisocialz
    //     for (int i = 2; i <= n; i++) {
    //         for (int j = 0; j <= n; j++) {
    //             f[i][j] = INT_MAX;
    //         }
    //     }

    //     // k = 2时
    //     for (int k = 2; k <= n; k++) {
    //         sumA += machineATime[k];
    //         time[k] = INT_MAX;
    //         for (int x = 0; x <= sumA; x++) {
    //             if (x < machineATime[k]) {
    //                 f[k][x] = f[k-1][x] + b[k];
    //             } else {
    //                 f[k][x] = min(f[k=1][x] + b[k], f[k-1][x-a[k]]);
    //             }
    //             time[k] = min(time[k], max(x, f[k][x]));
    //         }
    //     }
    //     return time[n];
    // }

    // public static void main(String[] args) {
    //     read();
    //     // int[] x = {2, 4, 3, 6, 1};
    //     // int[] y = {5, 2, 3, 1, 7};
    //     // int n = x.length;
    //     // int[] z = new int[n];
    //     System.out.println("完成作业所需最短时间" + schedule());
    //     // System.out.println("作业编号自0开始, 作业执行顺序是");
    //     // for (int j = 0; j < n; j++) {
    //     //     System.out.print(" " + z[j]);
    //     //     System.out.println();
    //     // }

    // }    
}