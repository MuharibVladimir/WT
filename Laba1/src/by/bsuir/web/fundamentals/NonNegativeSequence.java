package by.bsuir.web.fundamentals;

public class NonNegativeSequence {
    public static int[] MergeSequences(int[] a, int[] b){
        int size = a.length + b.length;
        int indRes = 0, indA = 0, indB = 0;
        int[] resultSequence = new int[size];

        while (indA < a.length || indB < b.length) {
            if (a[indA] < b[indB]) {
                resultSequence[indRes] = a[indA];
                indRes++;
                indA++;
            } else {
                resultSequence[indRes] = b[indB];
                indRes++;
                indB++;
            }

            if (indA == a.length) {
                System.arraycopy(b, indB, resultSequence, indRes, b.length - indB);
                break;
            }
            if (indB == b.length) {
                System.arraycopy(a, indA, resultSequence, indRes, a.length - indA);
                break;
            }
        }

        return resultSequence;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 6, 7, 4, 97, 345, 23, 65, 11, 19};
        int[] array2 = {4, 6, 96, 276, 71};

        for (int number : array1) {
            System.out.printf("%4d", number);
        }
        System.out.print("\n");

        for (int number : array2) {
            System.out.printf("%4d", number);
        }
        System.out.print("\n");

        int[] resultSequence = MergeSequences(array1, array2);

        for (int number : resultSequence) {
            System.out.printf("%4d", number);
        }
    }
}
