package by.bsuir.task5;

public class Sequence {
    private int[] sequence;

    public Sequence(int[] sequence) {
        this.sequence = sequence;
    }

    public int getCountOfThrowingElements(){
        int[] countElem = new int[sequence.length]; // count throwing elements
        for (int i = 0; i < sequence.length; i++){
            countElem[i] = 1;
            for (int j = i - 1; j >= 0; j--){
                if (sequence[i] > sequence[j]){
                    if (countElem[i] <= countElem[j]){
                        countElem[i] = countElem[j] + 1;
                    }
                }
            }
        }
        return sequence.length - getMaxNumber(countElem) ;
    }

    private int getMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Integer.max(max, array[i]);
        }
        return max;
    }


}
