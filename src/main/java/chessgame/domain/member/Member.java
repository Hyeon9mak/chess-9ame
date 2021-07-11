package chessgame.domain.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    private int totalWinCount;
    private int totalLoseCount;

    protected Member() {
    }

    public Member(String email, String password, String nickname) {
        this(null, email, password, nickname, 0, 0);
    }

    public Member(Long id, String email, String password, String nickname, int totalWinCount, int totalLoseCount) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.totalWinCount = totalWinCount;
        this.totalLoseCount = totalLoseCount;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTotalWinCount() {
        return totalWinCount;
    }

    public int getTotalLoseCount() {
        return totalLoseCount;
    }
}
