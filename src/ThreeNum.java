public class ThreeNum {
    public static void main(String[] args) {
        // 时间复杂度是O(n^3), 空间复杂度是O(n)
        int firstNum, secondNum, thirdNum, sumOfDigit, h;
        int[] numbers = new int[10];
        for(firstNum = 123; firstNum * 3 <= 987; firstNum++) {
            for(h = 0; h < 10; h++) { //为了不让上一次数组numbers[10]里的值影响到下一次循环，所以每次进行循环都要将numbers[10]全部赋值为0
                numbers[h] = 0;
            }
            numbers[firstNum / 100] = 1; //把firstNum百位的数字的对应数组元素设为1
            numbers[firstNum / 10 % 10] = 1; //把irstNum十位上的数字的对应数组元素赋值为1
            numbers[firstNum % 10] = 1; //把数字排列firstNum个位的数字的对应数组元素赋值为1
            secondNum = firstNum * 2;
            numbers[secondNum / 100] = 1;
            numbers[secondNum / 10 % 10] = 1;
            numbers[secondNum % 10] = 1;
            thirdNum= firstNum * 3;
            numbers[thirdNum / 100] = 1;
            numbers[thirdNum / 10 % 10] = 1;
            numbers[thirdNum % 10] = 1;
            for(sumOfDigit = 0,h = 1; h < 10; h++) {
                sumOfDigit = sumOfDigit + numbers[h];//计算辅助数组所有元素之和
            }
            if(sumOfDigit == 9) {
                System.out.printf("%d, \t%d, \t%d\n", firstNum, secondNum, thirdNum);
                }
            }
        }
    }
