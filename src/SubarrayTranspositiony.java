public class SubarrayTranspositiony {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k, high, low;
        // swap(array, low1, top1, low2, top2);
        SubarrayTranspositiony st = new SubarrayTranspositiony();
        st.DivideAndConquer(array, 0, 4, 10);
        for(int i=array[0]; i<array.length - 1; i++) {
            System.out.printf("%d\n", array[i]);
        }
    }
    public void swap(int[] a, int low1, int top1, int low2, int top2) {
        int temp;
        while(low1 <= top1) {
            temp = a[low1];
            a[low1] = a[low2];
            a[low2] = temp;
            low1++;
            low2++;
        }
    }

    public void DivideAndConquer(int[] a, int low, int k, int high) {
        if(low < high) {
            if((k-low+1) == (high-k)) {
                swap(a, low, k, k+1, high);
            }
            else if ((k-low+1) < (high-k)) {
                swap(a, low, k, low+high-k, high);
                DivideAndConquer(a, low, k, low+high-k-1);
            }
            else {
                swap(a, low, high+low-k-1, k+1, high);
                DivideAndConquer(a, high+low-k, k, high);
            }
        }
    }
}