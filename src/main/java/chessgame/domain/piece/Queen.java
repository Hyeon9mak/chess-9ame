package chessgame.domain.piece;

public class Queen implements Piece {

    private final Color color;
    private final Score score;

    public Queen(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public static Queen of(Color color) {
        return new Queen(color, Score.QUEEN);
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
