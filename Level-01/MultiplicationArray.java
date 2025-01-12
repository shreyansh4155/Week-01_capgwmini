import java.util.Scanner;

public class MultiplicationArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 6 to 9");
        int number = scanner.nextInt();
        int arr[] = new int[10];
        int n = arr.length;
        for(int i=0;i<n;i++){
            int num = i+ 1;
            arr[i] = num*number;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}