import java.util.Scanner;

public class BinarySearch1 {
    public static int binarySearchChanged(int[] a, int x) {
        int left = 0;
        int right = a.length-1; 
        int i = 0;  // i是小于x的最大元素的位置
        int j = 0;  // j是大于x的最小元素的位置
        while(left <= right) {
            int middle = (left + right)/2;
            if(x == a[middle]) {
                i = j = middle;
                System.out.println("x在数组中, 位置是a[" + i + "]");
                return middle;
            }
            if(x > a[middle]) {
                left = middle + 1;
            }
            else {
                right = middle -1;
            }
        }
        // 因为在上面搜搜哦的过程中, right和left的位置调转了
        i = right;
        j = left;
        if (x < a[0]) {
            System.out.println("搜索元素不在数组中.\n大于x的最小元素为a[0]\n没有小于x的最大元素");
        }
        else if (x > a[a.length-1]) {
            System.out.println("搜索元素不在数组中.\n小于x的最小元素为a[" + (a.length-1) + "]\n没有大于x的最小元素");
        }
        else {
            System.out.println("小于x的最大元素的位置为a[" + i + "]\n大于x的最小元素的位置是a[" + j + "]");
        }
        return -1;
    } 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] a = {20, 23, 32, 44, 57, 78, 99};
        System.out.print("请输入你要查找的数x: ");
        int x = keyboard.nextInt();
        binarySearchChanged(a, x);
    }
}