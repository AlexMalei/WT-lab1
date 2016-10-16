package by.bsuir.task6;

public class SquareMatrixMaker {
    private double[] numbers;
    private final int DEFAULT_LENGTH = 15;

    public SquareMatrixMaker(double[] numbers) {
        this.numbers = numbers;
    }

    public SquareMatrixMaker(){
        numbers = new double[DEFAULT_LENGTH];
        for (int i = 0; i < DEFAULT_LENGTH; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
    }

    public double[][] getSquareMatrix(){
        double[][] matrix = new double[numbers.length][numbers.length];
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                matrix[i][j] = numbers[(i + j) % 5];
            }
        }
        return matrix;
    }


}
