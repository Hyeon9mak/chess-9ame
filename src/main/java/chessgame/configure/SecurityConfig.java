package chessgame.configure;

import chessgame.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final MemberService memberService;

    public SecurityConfig(MemberService memberService) {
        this.memberService = memberService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 인증이 필요한 경로 설정
        http.authorizeRequests()
            .antMatchers("/**").authenticated();
        // .antMatchers("/**").permitAll(); 인증이 필요 없는 경로


        // 로그인 설정
        http.formLogin() // formLogin 사용할 거임.
            // .loginPage("/login") // 커스텀 로그인 페이지
            .defaultSuccessUrl("/") // 로그인 성공시 페이지
            .permitAll();

        // 로그아웃 설정
        http.logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // 로그아웃 경로
            .logoutSuccessUrl("/login") // 로그아웃 성공시 페이지
            .invalidateHttpSession(true); // 로그아웃 성공시 세션제거

        // 인증인가 실패시 이동할 경로
        http.exceptionHandling()
            .accessDeniedPage("/denied");
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(memberService).passwordEncoder(passwordEncoder());
    }
}
