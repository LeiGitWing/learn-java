
public class getMinWeight {
    int m = 3;
    int n = 3;
    int d = 4;
    int[][] c = {{1,3,2},{2,2,2},{3,1,2}};
    int [][] w = {{1,3,2},{2,2,2},{3,1,2}};
    int minWeight = Integer.MAX_VALUE;
    int nowValue = 0;
    int tempWeight;
    int[] bestWay = new int[n];
    int[] way = new int[n];
    boolean flag = false;
    //开始回溯算法，假设目前搜索到子集树的第t层。
    public boolean Backtrack(int t){
        //如果t已经大于了n-1，表明之前的搜索已经到达了叶子节点，现在的tempWeight已经是当前的最小值了。
        if(t > n-1 ){
                minWeight = tempWeight;
                for(int i=0;i<n;i++) {
                    bestWay[i] = way[i];     
                }
                flag =  true;
        }
        //当搜索还没有到叶子节点时，对于每一层，选定每个商家继续搜索下去。
        else{
            for(int j=0;j<m;j++){
                tempWeight += w[j][t];
                nowValue += c[j][t];
                way[t] = j;
                //进行剪枝函数，在当前节点符合条件，才继续迭代搜索下去，不符合条件，直接跳过进行下一个商家的搜索。
                if(tempWeight < minWeight && nowValue <= d) {
                    Backtrack(t+1);
                }
                tempWeight -= w[j][t];
                nowValue -= c[j][t];
            }
        }
        return flag;
    }
    public static void main(String[] args){
        getMinWeight gm = new getMinWeight();
        if(gm.Backtrack(0)== false) {
            System.out.println("未找到符合条件的解");
        }
        else{
            System.out.println("零件能够达到的最小重量为"+gm.minWeight);
            System.out.print("购买路径为:  ");
            for(int i = 0; i < gm.bestWay.length; i++) {

            }
            System.out.print(gm.bestWay[i] + " ");
                
        }
        
    }
}