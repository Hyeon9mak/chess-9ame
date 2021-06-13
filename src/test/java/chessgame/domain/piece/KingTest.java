package chessgame.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class KingTest {

    @Test
    @DisplayName("상대 말이 아군인지 적군인지 확인한다")
    void checkFriendlyOrEnemy() {
        // given
        Piece blackKing = King.of(Color.black());
        Piece whiteKing = King.of(Color.white());

        // then
        assertThat(blackKing.isFriendly(blackKing)).isTrue();
        assertThat(blackKing.isEnemy(whiteKing)).isTrue();

        assertThat(whiteKing.isFriendly(whiteKing)).isTrue();
        assertThat(whiteKing.isEnemy(blackKing)).isTrue();
    }
}
