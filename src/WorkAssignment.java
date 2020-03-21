import java.util.Scanner;

public class WorkAssignment {
    static int n = 0;  // n份工作给n个人做
    static int cost = 0;
    static int[] x = new int[100];
    static int[][] c = new int[100][100];

    public static void main(String[] args){
        System.out.print("How many workers? ");
        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();
        System.out.print("Price per task each worker: ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                c[i][j] = keyboard.nextInt();
                x[j] = 0;
            }
            cost += c[i][i]; // 设第一种可能性是满足对角线的费用
        }
        minimumValue(1, 0);
        System.out.println("Least cost is " + cost);
    }
    // 这里有个优化, 如果possibleCost>cost, 一定不是最优解, 就没有必要写了
    private static void minimumValue(int i, int possibleCost){
        if(i > n && possibleCost < cost ){  // 列出所有可能结果后, 找到了一个最小解
            cost = possibleCost;
            return ;
        }
        if(possibleCost < cost){
            for(int j = 1; j <= n; j++){
                if(x[j] == 0){
                    x[j] = 1;
                    minimumValue(i + 1, possibleCost + c[i][j]);
                    x[j] = 0;
                }
            }
        }
    }
}