package chessgame.domain.piece;

public interface Piece {

    boolean isFriendly(Piece piece);

    boolean isEnemy(Piece piece);

    Color getColor();
}
