/** Finds the winner of a tic-tac-toe board. */
public class TicTacToeWinner
{
    /**
     * Displays the winner of an example board.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        char[][] board = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'O', '.', 'X'}};

        char winner = winner(board);
        if (winner == '.')
            System.out.println("Nobody has won");
        else
            System.out.println("Winner: " + winner);
    }

    /**
     * Checks the three rows, the three columns and the two diagonals.
     *
     * @param board a 3 x 3 board with 'X', 'O' or '.' for an empty cell
     * @return the winning symbol, or '.' if nobody has won
     */
    public static char winner(char[][] board)
    {
        for (int i = 0; i < 3; i++)
        {
            if (isWinningLine(board[i][0], board[i][1], board[i][2]))
                return board[i][0];
            if (isWinningLine(board[0][i], board[1][i], board[2][i]))
                return board[0][i];
        }

        if (isWinningLine(board[0][0], board[1][1], board[2][2]))
            return board[0][0];
        if (isWinningLine(board[0][2], board[1][1], board[2][0]))
            return board[0][2];

        return '.';
    }

    /**
     * Decides whether a line has three equal symbols that are not empty.
     *
     * @param a the first cell
     * @param b the second cell
     * @param c the third cell
     * @return true if the line has a winner
     */
    public static boolean isWinningLine(char a, char b, char c)
    {
        return a != '.' && a == b && b == c;
    }
}
