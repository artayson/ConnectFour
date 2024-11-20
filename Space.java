
public class Space {
    
    /**
    * The number of columns in the game.
    */
    private static final int cols = 7;
    
    private Status status;
    
    /**
    * The number of rows in the game board or grid.
    */
    private static final int rows = 6;
    /**
    * Represents the total number of spaces in the game.
    */
    public static final int TOTAL_SPACES = rows * cols;
    public enum Status{TAKEN, NOT_TAKEN};
    

    public String[][] board;

    public Space() {
        board = new String[rows][cols];
        for(int i = 0;i < rows;i++) {
            for(int j=0;j < cols;j++) {
                board[i][j] = "_";
                board[i][j].setStatus(Status.NOT_TAKEN);
            }
        }
    }
    
    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
        this.status = status;
    }
    
    
    /**
    * Checks if a space in the game board or grid is already occupied.
    *
    * @return returns true if the space is full, false otherwise.
    */
    public static boolean isSpaceFull() {
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < cols; ++j){
                if(board[i][j].getStatus().equals(Status.TAKEN)){
                    return true;
                }
            }
        }
    }
    
    
    /**
    * Retrieves the number of wins for the current player.
    *
    * @return An int representing the number of wins for the player.
    */
    public static int playerWins() {

    }
    
    /**
    * Adds a specified number of points to the player's score.
    *
    * @param Adds points to a player.
    */
    public static void addPoints(int points) {

    }
    
    
    /**
    * Initializes a new player with the given name.
    *
    * @param name The name of the player to create.
    * @return Returns true if the player was successfully created, false otherwise.
    */
    public static boolean Player(String name) {
        
    }

    public void updateBoard(int coloumn, String token){
        boolean hasTokenBeenPlaced = false
        for (int i = board.length; i > coloumn; i--){
            if( board[i][coloumn].equals(Status.NOT_TAKEN){
                board[i][coloumn] = token;
                board[i][coloumn].setStatus(Status.TAKEN);
                hasTokenBeenPlaced = true;
            }
        }
        

    }

    public static String toString(){
        String s = "";
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < cols; ++j){
                s += board[i][j];
            }
            s += "\n";
        }
        return s;
    }
}




