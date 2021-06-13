package chessgame.domain.piece;

public enum Score {
    QUEEN(9),
    ROOK(5),
    BISHOP(3),
    KNIGHT(2.5),
    PAWN(1),
    KING(0);

    private final double value;

    Score(double value) {
        this.value = value;
    }
}
