public class TicTacToeWinner
{
    public static void main(String[] args)
    {
        char[][] board = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'O', '.', 'X'}};

        char winner = winner(board);
        if (winner == '.')
        {
            System.out.println("Nobody has won");
        }
        else
        {
            System.out.println("Winner: " + winner);
        }
    }

    public static char winner(char[][] board)
    {
        for (int i = 0; i < 3; i++)
        {
            if (isWinningLine(board[i][0], board[i][1], board[i][2]))
            {
                return board[i][0];
            }
            if (isWinningLine(board[0][i], board[1][i], board[2][i]))
            {
                return board[0][i];
            }
        }

        if (isWinningLine(board[0][0], board[1][1], board[2][2]))
        {
            return board[0][0];
        }
        if (isWinningLine(board[0][2], board[1][1], board[2][0]))
        {
            return board[0][2];
        }

        return '.';
    }

    public static boolean isWinningLine(char a, char b, char c)
    {
        return a != '.' && a == b && b == c;
    }
}
