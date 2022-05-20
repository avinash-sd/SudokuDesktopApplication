package sudoku.problemDomain;

import sudoku.computationLogic.SudokuUtilities;
import sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {

    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyofGridState() {
        // Getting a copy of gridState so as the game could not be corrupted by data manipulation.
        return SudokuUtilities.copyToNewArray(gridState);
    }

}
