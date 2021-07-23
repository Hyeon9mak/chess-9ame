package chessgame.service;

import chessgame.domain.member.Member;
import chessgame.domain.member.MemberRepository;
import chessgame.web.request.MemberSignUpRequest;
import chessgame.web.response.MemberResponse;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public MemberResponse signUpMember(MemberSignUpRequest request) {
        Member findMember = memberRepository.save(request.toMember());
        return MemberResponse.of(findMember);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Member> byUsername = memberRepository.findByEmail(email);
        Member member = byUsername.orElseThrow(() -> new UsernameNotFoundException(email));

        return new User(member.getEmail(), member.getPassword(), authorities());
    }

    private Collection<? extends GrantedAuthority> authorities() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
    }
}
