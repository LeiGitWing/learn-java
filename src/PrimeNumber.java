public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;

        for (int numbers = 101; numbers <= 200; numbers++) {
            boolean isPrime = false;
            
            for (int j = 2; j <= Math.sqrt(numbers); j++) { 
                if (numbers % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime == true) {
                count++;
                
                System.out.print(numbers + " ");
            }
        }
        System.out.println("\n"+"素数总数为："+count);
    }
}