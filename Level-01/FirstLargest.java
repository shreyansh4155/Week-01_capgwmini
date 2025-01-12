import java.lang.*;
import java.util.*;

class FirstLargest {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number");
		int fNum=scn.nextInt();
		System.out.println("Enter the second number");
		int sNum = scn.nextInt();
		System.out.println("Enter the third number");
		int tNum = scn.nextInt();

		//checking the first number that it is smallest or not

		boolean isFirstLargest = (fNum >= sNum) && (fNum >= tNum);
      		boolean isSecondLargest = (sNum >= fNum) && (sNum >= tNum);
        	boolean isThirdLargest = (tNum >= fNum) && (tNum >= sNum);


       	System.out.println("Is the first number the largest? " + isFirstLargest);
	}
}