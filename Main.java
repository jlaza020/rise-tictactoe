package TicTacToe;

import java.util.ArrayList;

public class Main {

    /**
     * Plays a game of TicTacToe.
     * @param game TicTacToe game.
     */
    public static void play(TicTacToe game){
    
        // Enter main game loop.
        boolean gameEnded = false;
        
        while(!gameEnded){
        
            int row = -1;
            int col = -1; 

            // TODO
            // Get user input to figure out what move to make.

            // Do a turn with the user's row and col.
            switch(game.doTurn(row, col)){
            
                case InvalidMove:
                    // TODO
                    break;
                case OK:
                    // TODO
                    break;
                case Win:
                    Player winner = game.getWinner();
                    System.out.println("Player " + winner.getName() + " won!\n");
                    break;
                case Tie:
                    // TODO
                    break;
                default:
                    throw new RuntimeException("Unrecognized DoTurnResult!");
            
            }       
            
        }
    
    }
    
    public static void main(String[] args) {

        TicTacToe game;
       
        // Create players.
        ArrayList<Player> players = new ArrayList<>();
        
        players.add(new Player("Alex"));
        players.add(new Player("Samantha"));
        
        // BONUS TODO
        // Allow players to enter their own names via user input.
             
        // Create a 3x3 TicTacToe game with 2 players.    
        game = new TicTacToe(3, 3, players);
        
        play(game);
        
    }
    
}
