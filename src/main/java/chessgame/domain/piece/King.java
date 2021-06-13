package chessgame.domain.piece;

public class King implements Piece {

    private final Color color;
    private final Score score;

    public King(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public static King of(Color color) {
        return new King(color, Score.KING);
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
