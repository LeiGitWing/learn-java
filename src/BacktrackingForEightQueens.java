import java.util.Arrays;

public class BacktrackingForEightQueens {
    int[][] board = new int[8][8];
    int total = 0;

    //放置第K个皇后
    public void putQueen(int k) {
        int max = board.length;

        if (k >= max) {
                total++;
                // 输出每一种可能
                for (int i = 0; i < max; i++) {
                    System.out.println(Arrays.toString(board[i]));
                }
                System.out.println("There are " + total + " solutions");
                System.out.println();
            } else {
                for (int i = 0; i < max; i++) {
                    if (check(k, i)) {
                        board[k][i] = 1;
                        putQueen(k + 1);
                        board[k][i] = 0;
                    }
                }
            }
    }

    private boolean check(int row, int col) {
        //检查列是否有皇后
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        //检查左上对角线是否有皇后
        for (int m = row - 1, n = col - 1; m >= 0 && n >= 0; m--, n--) {
            if (board[m][n] == 1) {
                return false;
            }
        }

        //检查右上对角线是否有皇后
        for (int m = row - 1, n = col + 1; m >= 0 && n < board[0].length; m--, n++) {
            if (board[m][n] == 1) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        BacktrackingForEightQueens solution = new BacktrackingForEightQueens();
        solution.putQueen(0);
    }
}