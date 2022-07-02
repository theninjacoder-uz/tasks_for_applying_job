public class TaskOne {
    public static void countRobotStepsToArriveMiddle(int[][] matrix){
        int length = matrix.length;
        int middle = (length >> 1);

        if( length != matrix[0].length
                || (length & 1) == 0){
            System.out.println("2D array should be matrix and have odd number of length");
            return;
        }

        for(int i = 0; i < length; ++i){
            for (int j = 0; j < length; ++j){
                if(matrix[i][j] == 1){
                    System.out.println(Math.abs(middle - i) + Math.abs(middle - j));
                    return;
                }
            }
        }
    }
}
