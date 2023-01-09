package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    //private final MemberService memberService = new MemberService(); // 스프링 컨테이너에 등록하는게 효율적
    private final MemberService memberService;

    // DI, 컴포넌트 스캔
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
