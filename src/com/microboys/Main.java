package com.microboys;

import com.microboys.presentation.ChessGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessGUI chessGUI = ChessGUI.getInstance();
        SwingUtilities.invokeLater(chessGUI);
    }
}
