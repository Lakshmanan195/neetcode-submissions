class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> rows=new ArrayList<>();
        List<Set<Integer>> cols=new ArrayList<>();
        List<Set<Integer>> sub=new ArrayList<>();
        for(int i=0;i<9;i++) {
            rows.add(new HashSet<>());
            sub.add(new HashSet<>());
        }
        for(int i=0;i<9;i++) cols.add(new HashSet<>());
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                if(rows.get(i).contains(board[i][j]-'0')) return false;
                rows.get(i).add(board[i][j]-'0');
            }
        }
        for(int i=0;i<board[0].length;i++){
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.') continue;
                if(cols.get(i).contains(board[j][i]-'0')) return false;
                cols.get(i).add(board[j][i]-'0');
            }
        }
        int k=0;
        for(int row=0;row<9;row+=3){
            for(int col=0;col<9;col+=3){
                for(int i=row;i<row+3;i++){
                    for(int j=col;j<col+3;j++){
                        if(board[i][j]=='.') continue;
                        if(sub.get(k).contains(board[i][j]-'0')) return false;
                        sub.get(k).add(board[i][j]-'0');
                    }
                }
                k+=1;
            }
        }
        return true;
    }
}
