public class EightQueens {  

    int max = 8;  
    int[] array = new int[max];  
    static int count = 0;

    public static void main(String[] args) {  
        check(); 
    }  
   
    private static void check() {
        int[] a = new int[10];  
        a[9] = 0;
        int i = 0;
        int count = 0;

        for (a[1] = 1; a[1] <= 8; ++a[1]) {
            for (a[2] = 1; a[2] <= 8; ++a[2]) {
                for (a[3] = 1; a[3] <= 8; ++a[3]) {
                    for (a[4] = 1; a[4] <= 8; ++a[4]) {
                        for (a[5] = 1; a[5] <= 8; ++a[5]) {
                            for (a[6] = 1; a[6] <= 8; ++a[6]) {
                                for (a[7] = 1; a[7] <= 8; ++a[7]) {
                                    for (a[8] = 1; a[8] <= 8; ++a[8]) {
                                        if(isPossible(a, 8) == false) {
                                            continue;
                                        } else {
                                            ++count;
                                            // System.out.printf("第%d种情况\n", ++count);
                                            // for (i = 1; i <= 8; ++i) {
                                            //     System.out.printf("%d", a[i]);
                                            //     System.out.println();
                                            // }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("There are " + count + " solutions");
    }  

    // 是否能在这个位置上放下皇后
    private static boolean isPossible(int[] a, int n) {  // n是皇后个数
        int i = 0;
        int j = 0;
        // 优化了这两层循环, 原本是i和j分别从1, 一直循环到8
        for (i = 2; i <= n; ++i) {  
            for (j = 1; j <= i - 1; ++j) {
                if (a[i] == a[j] || i - j == Math.abs(a[i] - a[j])) {  
                    return false;  
                }
            }  
        }  
        return true;  
    }     
}  