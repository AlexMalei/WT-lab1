package by.bsuir.task4;

import java.util.ArrayList;

public class ArrayChecking{

    private int[] array = null;


    public ArrayChecking(int[] array){
        this.array = array;
    }

    public Integer[] getIndexOfPrimes(){
        ArrayList<Integer> indexPrimesArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (checkNumber(array[i])){
                indexPrimesArray.add(i);
                System.out.println(i + " " + array[i]);
            }
        }
        return indexPrimesArray.toArray(new Integer[indexPrimesArray.size()]);
    }

    private boolean checkNumber(int number) {
        if (number == 2){
            return true;
        }
        if ((number <= 1) || (number % 2 == 0)){
            return false;
        }
        for (int i = 3; i <= ((int)Math.sqrt(number) + 1); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayChecking arrayChecking = new ArrayChecking(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 });
        Integer[] objarr = arrayChecking.getIndexOfPrimes();
        for (Integer i : objarr){
            System.out.println(i);
        }
    }


}
