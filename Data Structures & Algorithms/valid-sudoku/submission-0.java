class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        List<Set<Character>> rowSet = new ArrayList<>(9);
        List<Set<Character>> colSet = new ArrayList<>(9);
        List<Set<Character>> boxSet = new ArrayList<>(9);
        int boxNum ;

        for (int i = 0; i < 9; i++) {
            rowSet.add(new HashSet<>());
            colSet.add(new HashSet<>());
            boxSet.add(new HashSet<>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boxNum = ((i/3)*3)+(j/3);
                if(board[i][j]!='.') {
                    if (!(rowSet.get(i).add(board[i][j])) || !(colSet.get(j).add(board[i][j]))
                            || !boxSet.get(boxNum).add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
