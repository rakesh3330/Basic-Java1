
public class Nthprime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int currentNumber = 2; 
        while (true) {
            if (isPrime(currentNumber)) {
                count++;
                if (count == n) {
                    return currentNumber; 
                }
            }
            currentNumber++;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Example: Find the 10th prime number
        System.out.println("The " + n + "th prime number is: " + findNthPrime(n));
    }
}