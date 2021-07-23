package chessgame.domain.piece;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public abstract class ChessPiece implements Piece {

    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private Color color;
    private Score score;

    public ChessPiece() {
    }

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
