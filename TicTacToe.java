package TicTacToe;
import java.util.ArrayList;
import java.util.List;

/**
 * A game of TicTacToe.
 */
public class TicTacToe {
      
    public enum DoTurnResult { InvalidMove, OK, Win, Tie }  // Result of a turn. 
    
    protected static char[] symbols = {'X', 'O'};   // Symbols on board.
    
    private List<List<Integer>> board;      // TicTacToe board.
    private List<Player> players;           // TicTacToe players.
    private int numPlayers;                 // Number of players.
    private int currentPlayerNum;                 // Number of current player.
           
    /**
     * Constructs a TicTacToe game.
     * 
     * @param numRows Number of rows in board
     * @param numCols Number of columns in board
     * @param players TicTacToe players
     */
    public TicTacToe(int numRows, int numCols, ArrayList<Player> players) throws IllegalArgumentException{
    
        if(players.size() < 2)
            throw new IllegalArgumentException("Too little players!");
        else if(players.size() > symbols.length)
            throw new IllegalArgumentException("Too many players!");
                
        // TODO
        // Initialize the board.
        // Initialize the players (don't forget to set their symbols!).
        
        currentPlayerNum = 0;   
        
    }
    
    /**
     * Gets current player.
     * @return The current player.
     */
    public Player getCurrentPlayer(){
    
        // TODO
        
        return null;
    
    }
    
    /**
     * Make a player do a turn to mark his/her symbol on the board.
     * 
     * @param row Row of the cell that the player wishes to mark.
     * @param col Column of the cell that the player wishes to mark.
     * 
     * @return The result of the move (see DoTurnResult).
     */
    public DoTurnResult doTurn(int row, int col){
    
        // TODO
        
        return DoTurnResult.OK;
    
    }
    
    /**
     * Precondition: A previous call to doTurn() must have returned 
     * DoTurnResult.Win.
     * 
     * @return Player that won the game. Returns -1, if game has not
     * ended.
     */
    public Player getWinner(){
    
        // TODO
        
        return null;
        
    }
    
    /**
     * Prints board of this TicTacToe game.
     * 
     * @return String that represents the contents of the TicTacToe board.
     */
    public String toString(){
    
        // TODO
        
        return null;
    
    }
    
}
