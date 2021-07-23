package chessgame.web.request;

import chessgame.domain.member.Member;

public class MemberSignUpRequest {

    private String email;
    private String password;
    private String nickname;

    public MemberSignUpRequest() {
    }

    public MemberSignUpRequest(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    public Member toMember() {
        return new Member(email, password, nickname);
    }
}
