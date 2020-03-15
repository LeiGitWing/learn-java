public class CountRabits {
    public static void main(String[] args) {
        int month = 1;
        int firstRabitPairs = 1;
        int seconeRabitPairs = 0;
        int totalRabitPairs = 0;
        String response = "";
        
        for(month = 1; month <11; month++) {

            seconeRabitPairs = firstRabitPairs;
            firstRabitPairs = totalRabitPairs;
            totalRabitPairs = firstRabitPairs + seconeRabitPairs;

            response = "第" + month + "个月的兔子对数为" + totalRabitPairs;             
            System.out.println(response);
        }
        
    }
}