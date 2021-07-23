package chessgame.web;

import chessgame.service.MemberService;
import chessgame.web.request.MemberSignUpRequest;
import chessgame.web.response.MemberResponse;
import java.net.URI;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity signUpMember(@Valid @RequestBody MemberSignUpRequest request) {
        MemberResponse member = memberService.signUpMember(request);
        return ResponseEntity.created(URI.create("/login")).build();
    }
}
