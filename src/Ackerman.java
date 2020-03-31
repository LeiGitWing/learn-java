import java.util.Scanner;

public class Ackerman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int m = keyboard.nextInt();
        System.out.print("Pleasse input another number: ");
        int n = keyboard.nextInt();

        System.out.println("Ackerman(" + m + ", " + n + ") is " + ackerman(m, n));
    }


    // 根据题意公式而得
    private static int ackerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackerman(m - 1, 1);
        } else {
            return ackerman(m - 1, ackerman(m, n - 1));
        }
    }

    //备忘录算法
    private static int ack(int m, int n) {
        int[] val = new int[m+1];
        int[] ind = new int[m+1];

        for (int i = 1; i <= m; i++) {
            ind[i] = -1;
            val[i] = -1;
        }
        ind[0] = 0;
        val[0] = 1;

        while(ind[m] < n) {
            val[0]++;
            ind[0]++;

            // 已知n = 0时, A(m, 0) = A(m-1, 1)
            //    val[j] = A(j, ind[j])
            // 所以当ind[j-1] = 1, 如果有ind[j] = 0, 可求val[j] = val[j-1]
            for(int j = 1; j <= m; j++) {
                if (nd[j-1] == 1) {
                    val[j] = val[j-1];
                    ind[j] = 0;
                }
                // 已知n > 0, m > 0时, A(m,n) = A(m-1, A(m, n-1))
                //    val[i] = A(i, ind[i])
                // 所以当ind[i-1] = val[i]时, ind[i]+1, val[i] = val[i-1]
                if (val[j] != ind[j-1]) {
                    break;
                }
                ind[j]++;
                val[j] = val[j-1];
            }
        }
        return val[m];
    }

}