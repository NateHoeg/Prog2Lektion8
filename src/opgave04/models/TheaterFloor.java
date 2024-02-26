package opgave04.models;

public class TheaterFloor {
    int[][] seats = {
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
            { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
            { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
            { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 }
    };

    /**
     * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
     * Der returneres false hvis pladsen er optaget.
     *
     * @param row
     * @param seat
     * @return
     */

    public boolean buySeat(int row, int seat) {
        if(seats[row - 1][seat - 1] != 0) {
            //Minus 1 begge steder fordi den der booker sæde,
            //nok ikke ved at det teknisk set starter i 0
            seats[row - 1][seat - 1] = 0;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
     * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
     * til den pågældende pris.
     *
     * @param price
     * @return
     */
    public boolean buySeat(int price) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if(seats[i][j] == price) {
                    seats[i][j] = 0;
                    return true;
                }
            }
        }
        return false;
    }

    public void printTheaterFloor() {
        System.out.println("   Sæde :  1  2  3  4  5  6  7  8  9  10");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Række " + i +  " :  ");
            for (int j = 0; j < seats[i].length; j++) {
                if(seats[i][j] == 0) {
                    System.out.print("-- ");
                }
                else {
                    System.out.print(seats[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

