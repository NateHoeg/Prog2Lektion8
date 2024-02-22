package Opgave03;

public class LocateSmallest {
    public static void main(String[] args) {
        double[][] array = {
                {2, 4, 6, 1},
                {5, 7, 9, 2},
                {8, 6, 3, 7},
                {6, 9, 5, 3}
        };

        int[] location = locateSmallest(array);
        for (int i = 0; i < location.length; i++) {
            System.out.print(location[i] + " ");
        }

    }

    public static int[] locateSmallest (double[][] array) {
        double smallest = array[0][0];
        int[] smallestLocation = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] < smallest) {
                    smallestLocation[0] = i;
                    smallestLocation[1] = j;
                }
            }
        }
        return smallestLocation;
    }

}
