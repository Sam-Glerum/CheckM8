package com.microboys;

import presentation.ChessGUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChessGUI chessGUI = ChessGUI.getInstance();
        SwingUtilities.invokeLater(chessGUI);
    }
}
