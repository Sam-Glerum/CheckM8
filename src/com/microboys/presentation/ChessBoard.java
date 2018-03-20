package com.microboys.presentation;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChessBoard extends JPanel {
    private ArrayList<JPanel> letterRow;
    private String[] letters = new String[]{"", "a", "b", "c", "d", "e", "f", "g", "h"};

    public ChessBoard() {
        createChessBoard();
        createComponents();
    }



    public void createComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

    }

    public void createChessBoard() {
        letterRow = new ArrayList<>();

        for (int i = 0; i < 8; i++) {


            for (int position = 1; position < letters.length; position++) {
                JPanel panel = new JPanel();
                panel.setLayout(new BorderLayout());
                panel.setToolTipText(letters[position] + position);
                System.out.println(panel.getToolTipText());
                letterRow.add(panel);
            }
        }
        System.out.println(letterRow.size());


    }
}
