public class ThreeNum {
    public static void main(String[] args) {
        // first generate all the numbes then fliter the three numbers that can satisfying 

        int[] t = new int[9];  // 辅助数组, 保证1-9中的数字仅使用一次
        int firstNum, secondNum, thirdNum, s;
        // 把数据分成3分, 三个for循环, 时间复杂度是(3/n)^3
        for (firstNum = 123; firstNum <= 987 / 3; firstNum++) {
            for (secondNum = 246; secondNum <= 987 * 2 / 3; secondNum++) {
                for (thirdNum = 369; thirdNum <= 987; thirdNum++) {
                    // 找到满足1:2:3的数
                    if (secondNum == 2*firstNum && thirdNum == 3*firstNum) {
                        //为什么会有s?这个s是干嘛的... 为什么第二个数要乘1000?
                        s = firstNum + secondNum + thirdNum;
                        // System.out.print(s);

                        //将三个三位数拆分放入数组中
                        for (int i = 0; i < 9; i++) {
                            t[i] = s % 10;
                            s = s / 10;
                            // System.out.print(t[i]);
                        }
                            int  num = 0;//判断条件

                            for (int j = 0; j < 9; j++) {
                                for (int k = 0;  k < j; k++) {
                                    //比较数组中是否有数字相同且数组中不存在0
                                    if (t[j]==t[k] || t[j]==0 || t[k]==0) {
                                        num = 1;
                                        break;
                                    }
                                }
                            }
                            //满足firstNum:secondNum:thirdNum = 1:2:3且三个三位数中没有相同数字且没有0时输出 三个三位数
                            if (num == 0) {
                                System.out.printf("%d\t %d\t %d\n", firstNum, secondNum, thirdNum);
                        }
                    }
                }
            }
        }
     }   
}