import java.lang.Math;

public class NumberOfDaffodils {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int hundredPlace = i / 100;
            int tenPlace = i % 100 / 10;
            int onePlace = i % 10;

            double isDaffodilsNumber = Math.pow(onePlace, 3) + Math.pow(tenPlace, 3) + Math.pow(hundredPlace, 3);
            if (isDaffodilsNumber == i) {
                System.out.println(i + "是个水仙花数");
            }
        }
    }
}