package chessgame.domain.member;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository members;

    @Test
    @DisplayName("유저 생성 테스트")
    void create() {
        // given
        String email = "abc@email.com";
        String password = "password";
        String nickName = "ABC_CHOCOLATE";

        // when
        Member member = members.save(new Member(email, password, nickName));

        // then
        assertThat(member.getId()).isNotNull();
        assertThat(member.getEmail()).isEqualTo(email);
        assertThat(member.getPassword()).isEqualTo(password);
        assertThat(member.getNickname()).isEqualTo(nickName);
    }
}