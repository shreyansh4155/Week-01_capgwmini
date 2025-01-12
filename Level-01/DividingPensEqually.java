public class DividingPensEqually {

    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;

        //calculating pen each student got 
        int pensPerStudent = totalPens / numberOfStudents;

        //remaining pens will be calculated by the modulo operator
        int remainingPens = totalPens % numberOfStudents;

        //Printing the result

        System.out.println("The Pen Per Student is " + pensPerStudent);
        System.out.println("The remaining pen not distributed is " + remainingPens);
    }
}

