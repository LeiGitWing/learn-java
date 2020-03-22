// 思路一共分成三块
// 第一块, 根据题意确定变量
// 第二, 开始遍历整个数组, 并逐步找解, 2.1 和下一个解判断, 类似比较大小, 如果下一个解小于上一个解, 就把下一个解赋值给
// minValue. 如果下一个解大于上一个接, 跳过这一步, 接着往下遍历
// 第三, 输出打印信息

public class MinimumWeight {
    int n = 3;
    int m = 3;
    int d = 4;
    int[][] c = {{1, 2, 3}, {3, 2, 1}, {2, 2, 2}};
    int[][] w = {{1, 2, 3}, {3, 2, 1}, {2, 2, 2}};
    int minWeight = Integer.MAX_VALUE;
    int value = 0;
    int tempWeight;
    int[] bestWay = new int[n];
    int[] way = new int[n];
    boolean flag = false;

    public boolean isMinimum(int t){
        if(t > n-1 ){
                minWeight = tempWeight;
                for(int i = 0; i < n; i++)
                    bestWay[i] = way[i];     
                flag = true;
        } else {
            for(int j = 0; j < m; j++){
                tempWeight += w[j][t];
                value += c[j][t];
                way[t] = j;
                
                if(tempWeight < minWeight && value <= d) {
                    isMinimum(t + 1);
                }
                tempWeight -= w[j][t];
                value -= c[j][t];
            }
        }
        return flag;
    }
    public static void main(String[] args){
        MinimumWeight mw = new MinimumWeight();
        if(mw.isMinimum(0) == false) {
            System.out.println("No conditions found.");
        } else {
            System.out.println("Minimum weight is " + mw.minWeight);
            System.out.print("购买路径为:  ");
            for(int i : mw.bestWay){
                System.out.print(i + " ");    
            }
        }
    }
}