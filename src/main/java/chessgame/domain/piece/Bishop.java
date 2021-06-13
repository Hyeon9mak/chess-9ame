package chessgame.domain.piece;

public class Bishop implements Piece {

    private final Color color;
    private final Score score;

    public Bishop(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public static Bishop of(Color color) {
        return new Bishop(color, Score.BISHOP);
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
