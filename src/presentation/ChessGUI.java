package presentation;

import javax.swing.*;
import java.awt.*;

public class ChessGUI extends JFrame implements Runnable{
    private static ChessGUI instance = null;

    public static ChessGUI getInstance() {
        if (instance == null) {
            instance = new ChessGUI();
        }
        return instance;
    }

    @Override
    public void run() {
        this.setTitle("CheckM8"); // Set title
        this.setSize(new Dimension(800, 600)); // Set window size
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Set close operation
        this.setLocationRelativeTo(null); // Spawn window in the center

        createComponents(this.getContentPane()); // Create GUI-components

        this.setResizable(false); // Disable window resizing
        this.setVisible(true); // Make the window visible
    }

    public void createComponents(Container container) {
        this.setLayout(new BorderLayout());

        ChessBoard chessBoard = new ChessBoard();
        this.add(chessBoard);
    }
}
