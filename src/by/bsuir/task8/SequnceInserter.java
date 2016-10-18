package by.bsuir.task8;

public class SequnceInserter {


    public static int[] getInsertIndexes(double[] aArray, double[] bArray) {
        int aSize = aArray.length;
        int bSize = bArray.length;
        int aPointer = 0;
        int bPointer = 0;

        int[] indexes = new int[bSize];

        int i = 0;
        int indexesWritten = 0;
        while ((bPointer < bSize) && (aPointer < aSize)) {
            if (aArray[aPointer] < bArray[bPointer]) {
                aPointer++;
            } else {
                indexes[indexesWritten] = i;
                bPointer++;
                indexesWritten++;
            }

            i++;
        }

        while (bPointer < bSize) {
            indexes[indexesWritten] = i;
            bPointer++;
            indexesWritten++;
        }

        return indexes;
    }

    public static void main(String[] args) {
        int[] arr = SequnceInserter.getInsertIndexes(new double[]{ 1,3,4,5,6}, new double[]{1,3,5,325,245,5});
        for (int i : arr){
            System.out.println(i);
        }
    }
}
