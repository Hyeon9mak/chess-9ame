package chessgame.web.response;

import chessgame.domain.member.Member;

public class MemberResponse {

    private Long id;
    private String email;
    private String nickname;
    private Integer totalWinCount;
    private Integer totalLoseCount;

    public MemberResponse(Long id, String email, String nickname, Integer totalWinCount, Integer totalLoseCount) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.totalWinCount = totalWinCount;
        this.totalLoseCount = totalLoseCount;
    }

    public static MemberResponse of(Member member) {
        return new MemberResponse(member.getId(), member.getEmail(), member.getNickname(), member.getTotalWinCount(), member.getTotalLoseCount());
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

    public Integer getTotalWinCount() {
        return totalWinCount;
    }

    public Integer getTotalLoseCount() {
        return totalLoseCount;
    }
}
