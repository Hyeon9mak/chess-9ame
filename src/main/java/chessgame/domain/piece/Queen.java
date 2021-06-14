package chessgame.domain.piece;

public class Queen extends ChessPiece {

    public Queen(Color color, Score score) {
        super(color, score);
    }

    public static Queen of(Color color) {
        return new Queen(color, Score.QUEEN);
    }
}
