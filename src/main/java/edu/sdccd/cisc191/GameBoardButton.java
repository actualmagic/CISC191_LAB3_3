package edu.sdccd.cisc191;

import javafx.scene.control.Button;

/**
 * Extends the basic JavaFX Button with game functionality
 */
public class GameBoardButton extends Button {
    private int row;
    private int col;
    private boolean hasFish;
    private boolean isGuessed;

    public GameBoardButton(int row, int col, boolean hasFish)
    {
        this.row = row;
        this.col = col;
        this.hasFish = hasFish;

        // TODO: set min/pref width, default text

    }

    public void handleClick() {
        // TODO: update text
        if(hasFish) {
            // TODO "<><"
        } else {
            // TODO "X"
        }
        isGuessed = true;
        setDisabled(true);
    }
}