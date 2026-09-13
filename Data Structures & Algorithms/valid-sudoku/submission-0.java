class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();
        HashSet<Character> square = new HashSet<>();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(row.contains(board[i][j])){
                    return false;
                }else if(!(board[i][j]=='.')){
                    row.add(board[i][j]);
                }
            }
            row.clear();
        }
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(col.contains(board[j][i])){
                    return false;
                }else if(!(board[j][i]=='.')){
                    col.add(board[j][i]);
                }
            }
            col.clear();
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                int startrow= i*3;
                int startcol= j*3;
                for(int k = startrow; k<startrow+3; k++){
                    for(int z = startcol ; z<startcol+3; z++){
                        if(square.contains(board[k][z])){
                            return false;
                        }else if(!(board[k][z]=='.')){
                            square.add(board[k][z]);
                        }
                    }
                }
                square.clear();
            }
        }
        return true;
    }
}
