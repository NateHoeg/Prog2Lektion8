package Opgave02;

public class AverageMajorDiagonal {
    public static void main(String[] args) {
        double[][] array = {
                {2, 4, 6, 1},
                {5, 7, 9, 2},
                {8, 6, 3, 7},
                {6, 9, 1, 3}
        };

        System.out.println(averageMajorDiagonal(array));

    }

    public static double averageMajorDiagonal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        double average = sum/array.length;
        return average;
    }

}
