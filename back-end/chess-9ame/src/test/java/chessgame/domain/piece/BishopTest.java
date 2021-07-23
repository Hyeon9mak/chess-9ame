package chessgame.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BishopTest {

    @Test
    @DisplayName("상대 말이 아군인지 적군인지 확인한다")
    void checkFriendlyOrEnemy() {
        // given
        Piece blackBishop = Bishop.of(Color.black());
        Piece whiteBishop = Bishop.of(Color.white());

        // then
        assertThat(blackBishop.isFriendly(blackBishop)).isTrue();
        assertThat(blackBishop.isEnemy(whiteBishop)).isTrue();

        assertThat(whiteBishop.isFriendly(whiteBishop)).isTrue();
        assertThat(whiteBishop.isEnemy(blackBishop)).isTrue();
    }
}
