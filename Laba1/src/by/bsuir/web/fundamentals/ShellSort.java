package by.bsuir.web.fundamentals;

public class ShellSort {
    public static int[] Sorting(int[] array){
        int i = 0;
        int temp;

        while(i != array.length - 1) {
            if (array[i] > array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;

                if (i != 0) {
                    i--;
                }
            } else {
                i++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 6, 7, 4, 97, 345, 23, 65, 11, 19};

        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.print("\n");
        int[] arraySort = Sorting(array);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
