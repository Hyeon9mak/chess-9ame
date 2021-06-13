package chessgame.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RookTest {

    @Test
    @DisplayName("상대 말이 아군인지 적군인지 확인한다")
    void checkFriendlyOrEnemy() {
        // given
        Piece blackRook = Rook.of(Color.black());
        Piece whiteRook = Rook.of(Color.white());

        // then
        assertThat(blackRook.isFriendly(blackRook)).isTrue();
        assertThat(blackRook.isEnemy(whiteRook)).isTrue();

        assertThat(whiteRook.isFriendly(whiteRook)).isTrue();
        assertThat(whiteRook.isEnemy(blackRook)).isTrue();
    }
}