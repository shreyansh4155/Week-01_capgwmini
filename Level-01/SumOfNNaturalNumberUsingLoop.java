import java.util.*;
class SumOfNNaturalNumberUsingLoop {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scn.nextInt();
        System.out.println(sumOfNnaturalNumberUsingLoop(number));
        
    }
    
    public static int sumOfNnaturalNumberUsingLoop(int number){
        
        int sum = 0;
        for(int i=0;i<=number;i++){
            sum+=i;
        }
        return sum;
    }
}