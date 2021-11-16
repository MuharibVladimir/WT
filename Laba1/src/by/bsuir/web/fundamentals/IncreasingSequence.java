package by.bsuir.web.fundamentals;

public class IncreasingSequence {
    public static int FindElementsToDelete(int[] array) {
        int result = 0;
        int max = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] <= max) {
                result++;
            } else {
                max = array[i + 1];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 6, 7, 4, 97, 345, 23, 65, 11, 19};

        for (int number : array) {
            System.out.print(number + " ");
        }

        int amountToDelete = FindElementsToDelete(array);
        System.out.println("\nmin number elements to delete = " + amountToDelete);
    }
}
