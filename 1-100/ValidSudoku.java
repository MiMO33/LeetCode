class ValidSudoku{
    public boolean isValidSudoku(char[][] board) {
                //weather each row contain the digits 1-9 without repetition.
        int[] row = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] != '.'){
                    row[board[i][j] - '0' - 1]++;
                }
            }
            for (int count : row) {
                if(count != 0 && count != 1){
                    return false;
                }
            }
            for (int j = 0; j < 9; j++) {
                row[j] = 0;
            }
        }

        //weather each column  contain the digits 1-9 without repetition.
        int[] col = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[j][i] != '.'){
                    col[board[j][i] - '0' - 1]++;
                }
            }
            for (int count : col) {
                if(count != 0 && count != 1){
                    return false;
                }
            }
            for (int j = 0; j < 9; j++) {
                col[j] = 0;
            }
        }

        //weather each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        int[] boxes = new int[9];
        for (int i = 0; i < 9; i += 3) {
            for(int j = 0; j < 9;j += 3){
                for(int k = 0;k < 3;k++){
                    for(int l = 0;l < 3;l++){
                        if(board[i + k][j + l] != '.'){
                            boxes[board[i + k][j + l] - '0' - 1]++;
                        }
                    }
                }
                for (int count : boxes) {
                    if(count != 0 && count != 1){
                        return false;
                    }
                }
                for (int k = 0; k < 9; k++) {
                    boxes[k] = 0;
                }
            }
        }

        return true;
    } 
}