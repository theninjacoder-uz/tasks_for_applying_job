import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Task1
        int n = input.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        TaskOne.countRobotStepsToArriveMiddle(arr);


        //Task 2

        TaskTwo.findAllZerosOfPrimeNumbers(n);

        
    }
}
