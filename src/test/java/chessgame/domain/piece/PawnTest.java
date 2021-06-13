package chessgame.domain.piece;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PawnTest {

    @Test
    @DisplayName("상대 말이 아군인지 적군인지 확인한다")
    void checkFriendlyOrEnemy() {
        // given
        Piece blackPawn = Pawn.of(Color.black());
        Piece whitePawn = Pawn.of(Color.white());

        // then
        assertThat(blackPawn.isFriendly(blackPawn)).isTrue();
        assertThat(blackPawn.isEnemy(whitePawn)).isTrue();

        assertThat(whitePawn.isFriendly(whitePawn)).isTrue();
        assertThat(whitePawn.isEnemy(blackPawn)).isTrue();
    }
}
