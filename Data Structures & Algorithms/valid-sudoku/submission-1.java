class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> col = new HashSet<>();
        HashSet<Character>[] square = new HashSet[9];
        for(int i = 0; i<9; i++){
            square[i] = new HashSet<>();
        }
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(row.contains(board[i][j])){
                    return false;
                }else if(!(board[i][j]=='.')){
                    row.add(board[i][j]);
                }
                if(col.contains(board[j][i])){
                    return false;
                }else if(!(board[j][i]=='.')){
                    col.add(board[j][i]);
                }
                int squareindex = (i / 3) * 3 + (j / 3);
                if(square[squareindex].contains(board[i][j])){
                    return false;
                }else if(!(board[i][j]=='.')){
                    square[squareindex].add(board[i][j]);
                }
            }
            row.clear();
            col.clear();
        }
        return true;
    }
}