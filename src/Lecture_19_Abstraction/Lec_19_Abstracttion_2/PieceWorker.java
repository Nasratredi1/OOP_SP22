package Lecture_19_Abstraction.Lec_19_Abstracttion_2;

public class PieceWorker extends Employee {
    private double pieces;
    private double ratePerPiece;

    public PieceWorker(double pieces, double ratePerPiece) {
        this.pieces = pieces;
        this.ratePerPiece = ratePerPiece;
    }

    @Override
    public double getEarnings() {
        return getPieces() * getRatePerPiece();
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        this.pieces = pieces;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
}
