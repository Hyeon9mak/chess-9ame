package chessgame.domain.piece;

public class Knight implements Piece {

    private final Color color;
    private final Score score;

    public Knight(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public static Knight of(Color color) {
        return new Knight(color, Score.KNIGHT);
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
