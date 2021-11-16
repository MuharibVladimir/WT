package by.bsuir.web.fundamentals;

public class PrimeNumber {
    public static boolean CheckIsPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 6, 7, 4, 97, 345, 23, 65, 11, 19};

        for (int i = 0; i < array.length; i++) {
            if (CheckIsPrime(array[i])) {
                System.out.println(i);
            }
        }
    }

}
