package by.bsuir.web.fundamentals;

public class Matrix {
    public static int[][] CreateMatrix(int array[]){
        int index = 0;
        int[][] matrix = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = array[(j + index) % array.length];
            }

            index++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 6, 7, 4, 97, 345, 23, 65, 11, 19};

        for (int number : array) {
            System.out.print(number + " ");
        }

        int[][] resultMatrix = CreateMatrix(array);

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.printf("%4d", resultMatrix[i][j]);
            }

            System.out.print("\n");
        }
    }
}
