package com.microboys.domain;

public class Piece {
    private PieceType pieceType;
    private int position;
    private boolean isPresentOnBoard;

    public Piece(PieceType pieceType, int position) {
        this.pieceType = pieceType;
        this.position = position;
        isPresentOnBoard = true;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isPresentOnBoard() {
        return isPresentOnBoard;
    }

    public void setPresentOnBoard(boolean presentOnBoard) {
        isPresentOnBoard = presentOnBoard;
    }
}
