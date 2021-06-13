package chessgame.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KnightTest {

    @Test
    @DisplayName("상대 말이 아군인지 적군인지 확인한다")
    void checkFriendlyOrEnemy() {
        // given
        Piece blackKnight = Knight.of(Color.black());
        Piece whiteKnight = Knight.of(Color.white());

        // then
        assertThat(blackKnight.isFriendly(blackKnight)).isTrue();
        assertThat(blackKnight.isEnemy(whiteKnight)).isTrue();

        assertThat(whiteKnight.isFriendly(whiteKnight)).isTrue();
        assertThat(whiteKnight.isEnemy(blackKnight)).isTrue();
    }
}
