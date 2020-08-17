class Solution {
    public boolean exist(char[][] board, String word) {
        boolean exists = false;
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
               if(search(board,word,i,j,0))
                   exists = true;
            }
        }

        return exists;
    }
                  
                  
    public boolean search(char[][] board, String word, int i, int j, int k)
    {
        int m = board.length;
        int n = board[0].length;

        if(i<0 || j<0 || i>=board.length || j>=board[0].length)
        {
            return false;
        }

        if(board[i][j] == word.charAt(k))
        {
            char c = board[i][j];
            board[i][j]='#';
            
            if(k==word.length()-1)
                return true;
            else if(search(board, word, i-1, j, k+1)
            ||search(board, word, i+1, j, k+1)
            ||search(board, word, i, j-1, k+1)
            ||search(board, word, i, j+1, k+1))
                return true;
            
            board[i][j]=c;
        }

        return false;
    }
}