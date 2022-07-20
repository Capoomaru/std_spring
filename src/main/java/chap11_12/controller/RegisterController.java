package chap11_12.controller;

import chap11_12.spring.DuplicateMemberException;
import chap11_12.spring.MemberRegisterService;
import chap11_12.spring.RegisterRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    private MemberRegisterService memberRegisterService;

    public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
        this.memberRegisterService = memberRegisterService;
    }

    @RequestMapping("/register/step1")
    public String handleStep1() {
        return "register/step1";
    }

//    @PostMapping("/register/step2")
//    public String handleStep2(HttpServletRequest request) {
//        String agreeParam = request.getParameter("agree");
//        if (agreeParam == null || !agreeParam.equals("true"))
//            return "register/step1";
//        return "register/step2";
//    }

    @PostMapping("/register/step2")
    public String handleStep2Post(@RequestParam(value = "agree", defaultValue = "false") Boolean agree, RegisterRequest registerRequest) {
        if(!agree)
            return "register/step1";
        return "register/step2";
    }

    @GetMapping("/register/step2")
    public String handleStep2Get() {
        return "register/step1";
    }

    @PostMapping("/register/step3")
    public String handleStep3Post(RegisterRequest registerRequest) {
        try {
            memberRegisterService.regist(registerRequest);
            return "register/step3";
        } catch (DuplicateMemberException e) {
            return "register/step2";
        }
    }
}
