package chessgame.domain.piece;

public class Pawn extends ChessPiece {

    public Pawn(Color color, Score score) {
        super(color, score);
    }

    public static Pawn of(Color color) {
        return new Pawn(color, Score.PAWN);
    }
}
