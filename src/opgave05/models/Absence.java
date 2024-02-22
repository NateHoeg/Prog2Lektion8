package opgave05.models;

public class Absence {
    private int[][] absenceSchema;

    public Absence(int[][] absenceSchema) {
        this.absenceSchema = absenceSchema;
    }

    public void print() {
        for (int i = 0; i < absenceSchema.length; i++) {
            System.out.print("Elev " + (i + 1) + " ");
            for (int j = 0; j < absenceSchema[i].length; j++) {
                System.out.print("måned " + (j + 1) + ", fraværsdage " + absenceSchema[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int totalAbsence(int studentNumber) {
        int totalAbsenceDays = 0;
        for (int i = 0; i < absenceSchema[studentNumber - 1].length; i++) {
            totalAbsenceDays += absenceSchema[studentNumber - 1][i];
        }

        return totalAbsenceDays;
    }

    public double average(int studentNumber) {
        return (double) totalAbsence(studentNumber) / 12;
    }

    public int StudentsWithoutAbsence() {
        int noAbsenceStudents = 0;
        for (int i = 1; i < absenceSchema.length; i++) {
            if(totalAbsence(i) == 0) {
                noAbsenceStudents += 1;
            }
        }
        return noAbsenceStudents;
    }

    public int mostAbsence() {
        int highestAbsence = totalAbsence(1);
        int studentWithMostAbsence = 0;
        for (int i = 2; i < absenceSchema.length; i++) {
            if(totalAbsence(i) > highestAbsence) {
                highestAbsence = totalAbsence(i);
                studentWithMostAbsence = i;
            }
        }

        return studentWithMostAbsence;
    }

    public void reset(int studentNumber) {
        for (int i = 0; i < absenceSchema[studentNumber-1].length; i++) {
            absenceSchema[studentNumber-1][i] = 0;
        }
    }
}
