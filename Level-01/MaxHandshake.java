import java.util.*;
class MaxHandshake {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int noOfStudents = scn.nextInt();
        
        System.out.println("The total no. of handshakes are " + maxHandshakes(noOfStudents));
        
    }
    
    
    public static int maxHandshakes(int noOfStudents){
        int combinations = (noOfStudents * (noOfStudents - 1))/2;
        return combinations;
    }
}