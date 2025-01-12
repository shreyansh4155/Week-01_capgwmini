import java.util.Scanner;

public class MeanHeightOfPlayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      //  System.out.println("Enter the number 6 to 9");
        double [] height = new double[11];
        int n = height.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            System.out.println("Enter the number height of the player "+(i+1));
            height[i] = scanner.nextDouble();
        }
        for(int i=0;i<n;i++){
            sum+=height[i];
            
        }
        double mean = sum / n;
        System.out.println("The mean height of the players are "+mean);
    }
}