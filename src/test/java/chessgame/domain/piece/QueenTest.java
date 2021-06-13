package chessgame.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QueenTest {

    @Test
    @DisplayName("상대 말이 아군인지 적군인지 확인한다")
    void checkFriendlyOrEnemy() {
        // given
        Piece blackQueen = Queen.of(Color.black());
        Piece whiteQueen = Queen.of(Color.white());

        // then
        assertThat(blackQueen.isFriendly(blackQueen)).isTrue();
        assertThat(blackQueen.isEnemy(whiteQueen)).isTrue();

        assertThat(whiteQueen.isFriendly(whiteQueen)).isTrue();
        assertThat(whiteQueen.isEnemy(blackQueen)).isTrue();
    }
}
