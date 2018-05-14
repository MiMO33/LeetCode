class RotateImage{
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //cycle 4 times, each time operate a direction.
        for (int round = 0; round < n / 2; round++) {
            
            int topRowX = round;
            int topRowY = round;            
            int rightColX = n - round - 1;
            int rightColY = round;
            int downRowX = n - round - 1;
            int downRowY = n - round -1;
            int leftColX = round;
            int leftColY = n - round - 1;
            
            int[] tempArray = new int[n - round * 2 - 1];
            //put the top row into col
            for (int i = 0; i < n - round * 2 - 1; i++) {
                tempArray[i] = matrix[rightColY + i][rightColX];
                matrix[rightColY + i][rightColX] = matrix[topRowX][topRowY + i];
            }

            int tempNum = 0;
            //put the right col into the bottom row
            for (int i = 0; i < n - round * 2 - 1; i++) {
                tempNum = tempArray[i];
                tempArray[i] = matrix[downRowY][downRowX - i];
                matrix[downRowY][downRowX - i] = tempNum;
                printLocation(downRowY, downRowX - i);
            } 

            //put the bottom row into the left col
            for (int i = 0; i < n - round * 2 - 1; i++) {
                tempNum = tempArray[i];
                tempArray[i] = matrix[leftColY - i][leftColX];
                matrix[leftColY - i][leftColX] = tempNum;
                printLocation(downRowY, downRowX - i);
            }
            
            //put the left col into the top row
            for (int i = 0; i < n - round * 2 - 1; i++) {
                tempNum = tempArray[i];
                tempArray[i] = matrix[topRowY][topRowX + i];
                matrix[topRowY][topRowX + i] = tempNum;
                printLocation(downRowY, downRowX - i);
            } 
        }
    }
}