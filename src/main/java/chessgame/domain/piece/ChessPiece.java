package chessgame.domain.piece;

public abstract class ChessPiece implements Piece {

    private final Color color;
    private final Score score;

    public ChessPiece(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    @Override
    public boolean isFriendly(Piece piece) {
        return color.equals(piece.getColor());
    }

    @Override
    public boolean isEnemy(Piece piece) {
        return !color.equals(piece.getColor());
    }

    @Override
    public Color getColor() {
        return color;
    }
}
