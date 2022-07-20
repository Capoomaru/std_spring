package chap11_12.config;

import chap11_12.controller.RegisterController;
import chap11_12.spring.MemberRegisterService;
import chap11_12.survey.SurveyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig {

    @Autowired
    private MemberRegisterService memberRegisterService;

    @Bean
    public RegisterController registerController() {
        RegisterController registerController = new RegisterController();
        registerController.setMemberRegisterService(memberRegisterService);

        return registerController;
    }

    @Bean
    public SurveyController surveyController() {
        return new SurveyController();
    }
}
