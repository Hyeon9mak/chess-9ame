package chessgame.domain.piece;

public class Pawn implements Piece {

    private final Color color;
    private final Score score;

    public Pawn(Color color, Score score) {
        this.color = color;
        this.score = score;
    }

    public static Pawn of(Color color) {
        return new Pawn(color, Score.PAWN);
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
