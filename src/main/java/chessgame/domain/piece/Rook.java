package chessgame.domain.piece;

public class Rook implements Piece {

    private final Color color;
    private final Score score;

    public Rook(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public static Rook of(Color color) {
        return new Rook(color, Score.ROOK);
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
