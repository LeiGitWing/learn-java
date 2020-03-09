public class BinarySearch {
    
    public static void main(String args[]) {
        int a[] = { -15, -6, 0, 7, 9, 23, 54, 82, 101 };
        int result = bSearch(a, 7, 9);
        System.out.println(result);
    }

    //进行二分搜索
    public static int bSearch(int[] a, int x, int n) {
        int left = 0;
        int right = n - 1;
        int i = 0, j = 0;
        
        while (left <= right) {
            int middle = (left + right) / 2;
            if (x == a[middle]){
                i = j = middle;
                return middle;
            }   
            if (x > a[middle])
                left = middle + 1;
            else
                right = middle - 1;
        }
        //i为x左边的元素,j为x右边的元素
        //这里i为right,j为left,是因为在上面算法中最后一次搜索的right和left交换了
        i = right;
        j = left;
        //x<a[0],说明数组中没有比x更小的元素了
        if(x<a[0]){
            System.out.print("数组中不存在比"+x+"更小的最大元素位置"+", ");
            System.out.println("大于"+x+"的最小元素位置为"+j);
        }
        //x<a[8],说明数组中没有比x更大的元素了
        else if(x>a[8]){
            System.out.print("小于"+x+"的最大元素位置为"+i+", ");
            System.out.println("数组中不存在比"+x+"更大的最小元素位置");
        }
        else{
            System.out.print("小于"+x+"的最大元素位置为"+i+", ");
            System.out.println("大于"+x+"的最小元素位置为"+j);
        }
        //未找到x,返回-1
        return -1; 
    }
    
}