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

        //Set min/pref width, default text
        setMinWidth(50);
        setPrefHeight(50);
        setText("?");
        setDisable(false);
    }

    public void handleClick() {
        //Update text
        if(hasFish) {
            setText("<><");
        } else {
            setText("X");
        }
        isGuessed = true;
        setDisabled(true);
    }
}